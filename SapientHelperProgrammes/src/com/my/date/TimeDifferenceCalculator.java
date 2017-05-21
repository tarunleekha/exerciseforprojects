package com.my.date;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TimeDifferenceCalculator {
		Date startDate = new Date();// Set start date
		Date endDate   = new Date();// Set end date
		
		long duration  = endDate.getTime() - startDate.getTime();

		long diffInSeconds = TimeUnit.MILLISECONDS.toSeconds(duration);
		long diffInMinutes = TimeUnit.MILLISECONDS.toMinutes(duration);
		long diffInHours = TimeUnit.MILLISECONDS.toHours(duration);

}
