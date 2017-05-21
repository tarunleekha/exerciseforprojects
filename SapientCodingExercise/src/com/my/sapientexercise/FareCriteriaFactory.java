package com.my.sapientexercise;

public class FareCriteriaFactory {
	
	public static Fare getStationFare(final String weekChoice){
		if(weekChoice.equalsIgnoreCase("weekend")){
			return new WeekEndFareImpl();	
		}
		if(weekChoice.equalsIgnoreCase("weekday")){
			return new WeekDayFareImpl();
		}
		return null;
	}
	
}
