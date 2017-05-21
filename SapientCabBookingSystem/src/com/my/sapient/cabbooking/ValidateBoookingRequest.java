package com.my.sapient.cabbooking;

public class ValidateBoookingRequest {
	
	public boolean validatePickupLocation(final String pickupCode){
		if(Integer.valueOf(pickupCode) > 100001){
			return true;
		}
		return false;
	}
	
	public boolean validateDropLocation(final String dropLocation){
		if(Integer.valueOf(dropLocation) < 100100){
			return true;
			}
		return false;
	}

}
