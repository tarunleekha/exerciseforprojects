package com.my.sapientexercise;

import java.util.ArrayList;
import java.util.List;

public class ValidateSystem {

	private List<String> stationList = new ArrayList<String>();
	
	public ValidateSystem(){
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
	
	public boolean validateStationInput(final String stationName){
		if(!stationList.contains(stationName)){
			return false;
		}
		return true;
	}
	
	public boolean validateWeekChoice(final String weekChoice){
		if(!weekChoice.equalsIgnoreCase("weekday")&& !weekChoice.equalsIgnoreCase("weekend")){
			return false;
		}
		return true;
	}
	
}
