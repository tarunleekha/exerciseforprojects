package com.my.flight.search;

public class FlightSearchDTO {
	
	private String flightNumber;
	private String departureLoccation;
	private String arrivalLocation;
	private String flightDate;
	private String FilghtTime;
	private String FlightDuration;
	private String fare;
	
	public FlightSearchDTO() {
	}
	
	public FlightSearchDTO(String flightNo,String depLoc,String arrLoc, String flightDate, String flightTime,String flighDuration,String flightFare) {
		setFlightNumber(flightNo);
		setDepartureLoccation(depLoc);
		setArrivalLocation(arrLoc);
		setFlightDate(flightDate);
		setFilghtTime(flightTime);
		setFlightDuration(flighDuration);
		setFare(flightFare);
		
	}
	
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getDepartureLoccation() {
		return departureLoccation;
	}
	public void setDepartureLoccation(String departureLoccation) {
		this.departureLoccation = departureLoccation;
	}
	public String getArrivalLocation() {
		return arrivalLocation;
	}
	public void setArrivalLocation(String arrivalLocation) {
		this.arrivalLocation = arrivalLocation;
	}
	public String getFlightDate() {
		return flightDate;
	}
	public void setFlightDate(String flightDate) {
		this.flightDate = flightDate;
	}
	public String getFilghtTime() {
		return FilghtTime;
	}
	public void setFilghtTime(String filghtTime) {
		FilghtTime = filghtTime;
	}
	public String getFlightDuration() {
		return FlightDuration;
	}
	public void setFlightDuration(String flightDuration) {
		FlightDuration = flightDuration;
	}
	public String getFare() {
		return fare;
	}
	public void setFare(String fare) {
		this.fare = fare;
	}
	
	@Override
	public String toString() {
		return getFlightNumber()+"|"+getDepartureLoccation()+"|"+getArrivalLocation()+"|"+getFlightDate()+"|"+getFilghtTime()+"|"+getFlightDuration()+"|"+getFare();
	}
	
}
