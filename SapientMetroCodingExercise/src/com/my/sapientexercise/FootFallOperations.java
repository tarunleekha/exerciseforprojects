package com.my.sapientexercise;

import java.util.HashMap;
import java.util.Map;

public class FootFallOperations {
	
	private Map<String, Integer> stationMap;
	
	public Map<String, Integer> getStationMap() {
		return stationMap;
	}

	public void setStationMap(Map<String, Integer> stationMap) {
		this.stationMap = stationMap;
	}

	public void initializeFootFallMap(){
		stationMap = new HashMap<String, Integer>();
		stationMap.put("A1", 0);
		stationMap.put("A2", 0);
		stationMap.put("A3", 0);
		stationMap.put("A4", 0);
		stationMap.put("A5", 0);
		stationMap.put("A6", 0);
		stationMap.put("A7", 0);
		stationMap.put("A8", 0);
		stationMap.put("A9", 0);
		stationMap.put("A10", 0);
	}
	
	public void initializeStationNameMap(){
		stationMap = new HashMap<String, Integer>();
		stationMap.put("A1", 0);
		stationMap.put("A2", 1);
		stationMap.put("A3", 2);
		stationMap.put("A4", 3);
		stationMap.put("A5", 4);
		stationMap.put("A6", 5);
		stationMap.put("A7", 6);
		stationMap.put("A8", 7);
		stationMap.put("A9", 8);
		stationMap.put("A10",9);
	}
	
	
	/*public void incrementFootFall(final String stationValue){
		stationMap.put(stationValue, stationMap.get(stationValue)+1);
	}*/
	
	public void printFootFall(String stationName){
		System.out.println("Total Foot fall for "+stationName +"is " +stationMap.get(stationName));
	}
	
}
