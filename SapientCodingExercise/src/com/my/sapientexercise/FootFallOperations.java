package com.my.sapientexercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FootFallOperations {
	
	private Map<String, Integer> stationMap;
	private Map<Integer, String> stationIndexMap;
	private Map<String, Integer> stationNameMap;
	private List<Integer> sourceCountList = new ArrayList<Integer>();
	private List<Integer> departureCountList = new ArrayList<Integer>();
	
	public Map<Integer, String> getStationIndexMap() {
		return stationIndexMap;
	}

	public void setStationIndexMap(Map<Integer, String> stationIndexMap) {
		this.stationIndexMap = stationIndexMap;
	}

	
	public List<Integer> getDepartureCountList() {
		return departureCountList;
	}

	public void setDepartureCountList(List<Integer> departureCountList) {
		this.departureCountList = departureCountList;
	}

	public List<Integer> getArrivalCountList() {
		return sourceCountList;
	}

	public void setArrivalCountList(List<Integer> arrivalCountList) {
		this.sourceCountList = arrivalCountList;
	}

	
	public Map<String, Integer> getStationMap() {
		return stationMap;
	}

	public void setStationMap(Map<String, Integer> stationMap) {
		this.stationMap = stationMap;
	}
	
	public void initializeDepartureList(){
		sourceCountList.add(0, 0);
		sourceCountList.add(1, 0);
		sourceCountList.add(2, 0);
		sourceCountList.add(3, 0);
		sourceCountList.add(4, 0);
		sourceCountList.add(5, 0);
		sourceCountList.add(7, 0);
		sourceCountList.add(8, 0);
		sourceCountList.add(9, 0);
	}
	
	public void initializeArrivalList(){
		departureCountList.add(0, 0);
		departureCountList.add(1, 0);
		departureCountList.add(2, 0);
		departureCountList.add(3, 0);
		departureCountList.add(4, 0);
		departureCountList.add(5, 0);
		departureCountList.add(6, 0);
		departureCountList.add(7, 0);
		departureCountList.add(8, 0);
		departureCountList.add(9, 0);
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
	
	public void initializeStationIndex(){
		stationIndexMap = new HashMap<Integer,String>();
		stationIndexMap.put(0,"A1");
		stationIndexMap.put(1,"A2");
		stationIndexMap.put(2,"A3");
		stationIndexMap.put(3,"A4");
		stationIndexMap.put(4,"A5");
		stationIndexMap.put(5,"A6");
		stationIndexMap.put(6,"A7");
		stationIndexMap.put(7,"A8");
		stationIndexMap.put(8,"A9");
		stationIndexMap.put(9,"A10");
	}
	
	
	public void incrementFootFall(final String stationValue){
		getStationMap().put(stationValue, stationMap.get(stationValue)+1);
	}
	
	public void incrementDepartureCount(final int stationIndex){
		//getStationMap().put(stationValue, stationMap.get(stationValue)+1);
		getDepartureCountList().add(stationIndex, getDepartureCountList().get(stationIndex) +1);   
	}
	
	public void incrementArrivalCount(final int stationIndex){
		getArrivalCountList().add(stationIndex, getArrivalCountList().get(stationIndex) +1);
	}

	public void setStationNameMap(Map<String, Integer> stationNameMap) {
		this.stationNameMap = stationNameMap;
	}

	public Map<String, Integer> getStationNameMap() {
		return stationNameMap;
	}
	
}
