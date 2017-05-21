package com.my.sapientexercise;

public class WeekEndFareImpl implements Fare{

	@Override
	public float getFare(final int stationsTravelled) {
		return (float) (stationsTravelled * 5.5);
	}
}
