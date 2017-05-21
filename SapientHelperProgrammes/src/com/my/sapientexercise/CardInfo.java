package com.my.sapientexercise;

public class CardInfo {
	
	private String cardNo;
	private float balance;
	private String usualSourceStation;
	private String usualDestinationStation;
	public String getUsualDestinationStation() {
		return usualDestinationStation;
	}

	public void setUsualDestinationStation(String usualDestinationStation) {
		this.usualDestinationStation = usualDestinationStation;
	}

	private String usualFare;
	
	public String getUsualFare() {
		return usualFare;
	}

	public void setUsualFare(String usualFare) {
		this.usualFare = usualFare;
	}

	public String getUsualSourceStation() {
		return usualSourceStation;
	}

	public void setUsualSourceStation(String usualSourceStation) {
		this.usualSourceStation = usualSourceStation;
	}

	public String getUsualDepartureStation() {
		return usualDepartureStation;
	}

	public void setUsualDepartureStation(String usualDepartureStation) {
		this.usualDepartureStation = usualDepartureStation;
	}

	private String usualDepartureStation;

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

}
