package com.my.sapient.cabbooking;

public class BookingRequest {
	
	private String requestId;
	private String pickupAreaCode;
	private String dropAreaCode;
	private String pickupTime;
	
	public String getRequestId() {
		return requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getPickupAreaCode() {
		return pickupAreaCode;
	}
	public void setPickupAreaCode(String pickupAreaCode) {
		this.pickupAreaCode = pickupAreaCode;
	}
	public String getDropAreaCode() {
		return dropAreaCode;
	}
	public void setDropAreaCode(String dropAreaCode) {
		this.dropAreaCode = dropAreaCode;
	}
	public String getPickupTime() {
		return pickupTime;
	}
	public void setPickupTime(String pickupTime) {
		this.pickupTime = pickupTime;
	}
}
