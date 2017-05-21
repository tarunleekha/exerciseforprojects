package com.my.sapientexercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class PerCardReport {
	
	private FareCalculator fareCalculator;
	
	public List<String> getUsualTravelStation(Map<String, Integer> stationMap){
		int maxValueInMap=(Collections.max(stationMap.values()));
		final List<String> usualStationList = new ArrayList<String>();
        for (Entry<String, Integer> entry : stationMap.entrySet()) {  
            if (entry.getValue()==maxValueInMap) {
                usualStationList.add(entry.getKey());     
            }
        }
		return usualStationList;
	}
	
	
	
	public void printUsualStations(CardInfo cardInfo ,List<String> usualStationList ){
		
		for(String usualStations :usualStationList){
			String[] parsedValues = parseUsualStations(usualStations);
			String swipeInStation = parsedValues[0]; 
			String swipeOutStation = parsedValues[1];
			fareCalculator = new FareCalculator();
			float fare = fareCalculator.calculateStationFare(swipeInStation, swipeOutStation, "weekend");
			System.out.println("Card "+cardInfo.getCardNo()+" used to travel from station "+swipeInStation+"to station "+swipeOutStation+".Fare is Rs"+fare+
					"and balance on card is Rs"+cardInfo.getBalance());
		}
	}
	
	private String[] parseUsualStations(String usualStation){
		String[] parsedValues = {"",""};
		int toIndex = usualStation.indexOf("to");
		parsedValues[0] = usualStation.substring(0,toIndex); 
		parsedValues[1] = usualStation.substring(toIndex+2,usualStation.length());	
		return parsedValues;
		
	}
	
}
