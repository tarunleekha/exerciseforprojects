package com.my.sapientexercise;

public class FareCriteriaFactory {
	
	public static float getStationFare(final String weekChoice,final int stationsTravelled){
		Fare fare = null;
		if(weekChoice.equalsIgnoreCase("weekend")){
			fare = new WeekEndFareImpl();	
		}
		if(weekChoice.equalsIgnoreCase("weekday")){
			fare = new WeekDayFareImpl();
		}
		return fare.getFare(stationsTravelled);
	}
	
}
