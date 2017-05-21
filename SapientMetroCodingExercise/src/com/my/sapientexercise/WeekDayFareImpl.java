package com.my.sapientexercise;

public class WeekDayFareImpl implements Fare {

	@Override
	public float getFare(final int stationsTravelled) {
		return (float) (stationsTravelled * 7);
	}

}
