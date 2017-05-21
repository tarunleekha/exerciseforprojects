package com.my.general;

import java.util.ArrayList;
import java.util.List;

public class Validator {

	private List<String> stationList = new ArrayList<String>();
	
	public Validator(){
		stationList.add("A1");
		stationList.add("A2");
		stationList.add("A3");
		stationList.add("A4");
		stationList.add("A5");
		stationList.add("A6");
		stationList.add("A7");
		stationList.add("A8");
		stationList.add("A9");
		stationList.add("A10");
	}
	
	public boolean isMinBalPresent(final float  balance){
		if(balance < 5.5 ){
			return false;
		}
		return true;
	}
	
	public void validateStationInput(final String stationName) throws Exception{
		if(!stationList.contains(stationName)){
			throw new Exception("Not a Valid Station Name");
		}
	}
	
	public void validateWeekChoice(final String weekChoice) throws Exception{
		if(!weekChoice.equalsIgnoreCase("weekday")&& !weekChoice.equalsIgnoreCase("weekend")){
			throw new Exception("Not a Valid Week Choice");
		}
	}
	
}
