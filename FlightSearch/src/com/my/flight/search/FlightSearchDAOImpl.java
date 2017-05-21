package com.my.flight.search;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;



public class FlightSearchDAOImpl implements FlightSearchDAO {
 

 @Override
 public List<FlightSearchDTO> searchFlightPrepare(String dirLocation) throws FlightNotFoundException, FileNotFoundException {
  File dir=new File(dirLocation);
  
  List<FlightSearchDTO> flightDetailsInAllFiles=new ArrayList<FlightSearchDTO>();
  
  if(dir.exists()){
   File[] files = dir.listFiles();
   for (int i = 0; i < files.length; i++) {
	int lineCount=0;   
    File file = files[i];
    try {
     BufferedReader readFileBr=new BufferedReader(new FileReader(file));
     String fileData=null;
     while ((fileData = readFileBr.readLine()) != null) {
    	// For ignoring first line 
      if(lineCount==0){
    	  lineCount = lineCount+1;
    	  continue;
      }
      FlightSearchDTO flightSearchDTO=new FlightSearchDTO();
      String[] dataArray = new String[7];
      dataArray = fileData.split("\\|");
      //StringTokenizer st=new StringTokenizer(fileData,"|");
      if(file.getName().endsWith("csv")){
    	  //st=new StringTokenizer(fileData,"\\s*,\\s*");
    	  dataArray = fileData.split("\\s*,\\s*");
      }
      /*List<String> list = new LinkedList<String>();
      int myIndex=0;
      while(st.hasMoreElements()){
       String data="";
       data = (String)st.nextElement();
       //list.add(myIndex,data);
       dataArray[myIndex] = data;
       myIndex++;
      }*/
     
      
      flightSearchDTO.setFlightNumber(dataArray[0]);
      flightSearchDTO.setDepartureLoccation(dataArray[1]);
      flightSearchDTO.setArrivalLocation(dataArray[2]);
      flightSearchDTO.setFlightDate(dataArray[3]);//valid till in csv file
      flightSearchDTO.setFilghtTime(dataArray[4]);
      flightSearchDTO.setFlightDuration(dataArray[5]);
      flightSearchDTO.setFare(dataArray[6]);
      flightDetailsInAllFiles.add(flightSearchDTO);
     }
    } catch (FileNotFoundException exception) {
     new FlightNotFoundException(exception.getMessage());
     
    }catch (IOException exception) {
     new FlightNotFoundException(exception.getMessage());
    }catch (Exception exception) {
    	exception.printStackTrace();
     new FlightNotFoundException(exception.getMessage());
    }
    
   }
   return flightDetailsInAllFiles;
  }else{
   throw new FileNotFoundException("File is not found on given location");
  }
 }

 @Override
 public List<FlightSearchDTO> searchFlightResult(String depLoc,
   String arrLoc, String flightDate, String outPref,String dirLocation)
   throws FlightNotFoundException, FileNotFoundException {
  
  List<FlightSearchDTO> allFlightData = searchFlightPrepare(dirLocation);
  List<FlightSearchDTO> matchedFlightData=new ArrayList<FlightSearchDTO>();
  for (Iterator iterator = allFlightData.iterator(); iterator.hasNext();) {
   FlightSearchDTO flightSearchDTO = (FlightSearchDTO) iterator.next();
   if(flightSearchDTO.getDepartureLoccation().equalsIgnoreCase(depLoc)&&flightSearchDTO.getArrivalLocation().equalsIgnoreCase(arrLoc)&&flightSearchDTO.getFlightDate().equalsIgnoreCase(flightDate)){
    matchedFlightData.add(flightSearchDTO);
   }
  }
  FlightComparator flightComparator =  new FlightComparator();
  flightComparator.setOutputPref(outPref);
  Collections.sort(matchedFlightData, flightComparator);
  
  return matchedFlightData;
 }

}
