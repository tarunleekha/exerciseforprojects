package com.my.sapientexercise;

import java.util.Map.Entry;


public class TotalFootFallAPI {
	
	public static void main(String[] args) {
		final MetroCardSystem cardSystem = new MetroCardSystem();
		final FootFallOperations footFall = cardSystem.processFootFall("C1");
		for(final Entry<String, Integer> entry:footFall.getStationMap().entrySet()){
			System.out.println("Total Foot Fall for station"+entry.getKey()+"is"+entry.getValue());
		}
	}

}
