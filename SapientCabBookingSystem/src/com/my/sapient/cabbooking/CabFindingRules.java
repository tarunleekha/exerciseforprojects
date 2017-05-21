package com.my.sapient.cabbooking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class CabFindingRules {
	
	/*
	 * • The cab booked should reach the pickup point 15 minutes early.
	   • The cab earns a profit margin of at least 20%(possible for all cases).
	 * */
	
	private Date currentTime;

	public Date getCurrentTime() {
		Calendar cal = Calendar.getInstance();
		currentTime = cal.getTime();
		return currentTime;
	}

	
	
	
	public boolean checkTimeRestictions(final BookingRequest request,final CabInfo cab){
		Calendar cal = Calendar.getInstance();
		currentTime = cal.getTime();
		boolean isTimeValidated = false;
		String initialLocation = cab.getInitialLocation();
		String pickupArea = request.getPickupAreaCode();
		int areaToBeCovered = Integer.valueOf(pickupArea) - Integer.valueOf(initialLocation);
		if(areaToBeCovered<0){
			areaToBeCovered = -(areaToBeCovered);
		}
		int timeTaken = areaToBeCovered*2;
		cab.setEstimatedTime(timeTaken);
		cal.add(Calendar.MINUTE, timeTaken);
		final Date calculatedDate = cal.getTime();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date requestDate;
		try {
			requestDate = formatter.parse(request.getPickupTime());
			if(requestDate.getTime() - calculatedDate.getTime() > 15){
				isTimeValidated =  true;
			}else{
				isTimeValidated =  false;
			}
		} catch (ParseException e) {
			e.printStackTrace();
		} 
		 	
		return isTimeValidated; 
	}
}
