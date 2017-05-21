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
	private List<Integer> destinationCountList = new ArrayList<Integer>();
	
	public Map<Integer, String> getStationIndexMap() {
		return stationIndexMap;
	}

	public void setStationIndexMap(Map<Integer, String> stationIndexMap) {
		this.stationIndexMap = stationIndexMap;
	}

	
	public List<Integer> getDestinationCountList() {
		return destinationCountList;
	}

	public void setDestinationCountList(List<Integer> destinationCountList) {
		this.destinationCountList = destinationCountList;
	}

	public List<Integer> getSourceCountList() {
		return sourceCountList;
	}

	public void setSourceCountList(List<Integer> sourceCountList) {
		this.sourceCountList = sourceCountList;
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
		sourceCountList.add(6, 0);
		sourceCountList.add(7, 0);
		sourceCountList.add(8, 0);
		sourceCountList.add(9, 0);
	}
	
	public void initializeArrivalList(){
		destinationCountList.add(0, 0);
		destinationCountList.add(1, 0);
		destinationCountList.add(2, 0);
		destinationCountList.add(3, 0);
		destinationCountList.add(4, 0);
		destinationCountList.add(5, 0);
		destinationCountList.add(6, 0);
		destinationCountList.add(7, 0);
		destinationCountList.add(8, 0);
		destinationCountList.add(9, 0);
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
	
	public void incrementSourceCount(final int stationIndex){
		//getStationMap().put(stationValue, stationMap.get(stationValue)+1);
		getSourceCountList().add(stationIndex, getSourceCountList().get(stationIndex) +1);   
	}
	
	public void incrementDestinationCount(final int stationIndex){
		getDestinationCountList().add(stationIndex, getDestinationCountList().get(stationIndex) +1);
	}

	public void setStationNameMap(Map<String, Integer> stationNameMap) {
		this.stationNameMap = stationNameMap;
	}

	public Map<String, Integer> getStationNameMap() {
		return stationNameMap;
	}
	
}
