package com.my.sapientexercise;

import java.util.HashMap;
import java.util.Map;

public class FareCalculator {
	
	private Map<String, Integer> stationValues ;
	public FareCalculator() {
		stationValues = new HashMap<String, Integer>();
		stationValues.put("A1", 1);
		stationValues.put("A2", 2);
		stationValues.put("A3", 3);
		stationValues.put("A4", 4);
		stationValues.put("A5", 5);
		stationValues.put("A6", 6);
		stationValues.put("A7", 7);
		stationValues.put("A8", 8);
		stationValues.put("A9", 9);
		stationValues.put("A10", 10);
	}

	public float calculateStationFare(final String sourceStation,final String destStation,final String weekChoice){
		final int sourceStationValue = stationValues.get(sourceStation.trim());   
		final int destStationValue = stationValues.get(destStation.trim());
		int stationsTravelled = sourceStationValue - destStationValue; 
		if(stationsTravelled < 0 ){
			stationsTravelled = -stationsTravelled;
		}
		FareCriteriaFactory criteriaFactory = new FareCriteriaFactory();
		final Fare fare = criteriaFactory.getStationFare(weekChoice);
		return fare.getFare(stationsTravelled);
	}
	
	/*private int parseStationValue(String stationName){
		int stationValue = Integer.valueOf(stationName.substring(1,stationName.length()-1));
		return stationValue;
	}*/
}
