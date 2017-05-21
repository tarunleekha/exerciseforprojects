package com.my.sapient.cabbooking;

public class CabInfo {
	
	private String cabNo;
	private String initialLocation;
	private int estimatedTime;
	
	public int getEstimatedTime() {
		return estimatedTime;
	}
	public void setEstimatedTime(int estimatedTime) {
		this.estimatedTime = estimatedTime;
	}
	public String getCabNo() {
		return cabNo;
	}
	public void setCabNo(String cabNo) {
		this.cabNo = cabNo;
	}
	public String getInitialLocation() {
		return initialLocation;
	}
	public void setInitialLocation(String initialLocation) {
		this.initialLocation = initialLocation;
	}

}
