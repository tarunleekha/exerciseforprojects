package com.my.sapientexercise;

import java.util.HashMap;
import java.util.Map;

public class FareCalculator {
	
	private Map<String, Integer> stationMap ;
	public FareCalculator() {
		stationMap = new HashMap<String, Integer>();
		stationMap.put("A1", 1);
		stationMap.put("A2", 2);
		stationMap.put("A3", 3);
		stationMap.put("A4", 4);
		stationMap.put("A5", 5);
		stationMap.put("A6", 6);
		stationMap.put("A7", 7);
		stationMap.put("A8", 8);
		stationMap.put("A9", 9);
		stationMap.put("A10", 10);
	}

	public float calculateStationFare(final String sourceStation,final String destStation,final String weekChoice){
		final int sourceStationValue = stationMap.get(sourceStation.trim());   
		final int destStationValue = stationMap.get(destStation.trim());
		int stationsTravelled = sourceStationValue - destStationValue; 
		if(stationsTravelled < 0 ){
			stationsTravelled = -stationsTravelled;
		}
		return FareCriteriaFactory.getStationFare(weekChoice,stationsTravelled);
	}
	
	
	
}
