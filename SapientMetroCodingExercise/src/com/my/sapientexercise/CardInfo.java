package com.my.sapientexercise;

import java.util.Map;

public class CardInfo {
	
	private String cardId;
	private float balance;
	private String usualTravelStation;
	private String usualFare;
	private Map<String,Integer> stationMapCount;
	
	public Map<String, Integer> getStationMapCount() {
		return stationMapCount;
	}

	public void setStationMapCount(Map<String, Integer> stationMapCount) {
		this.stationMapCount = stationMapCount;
	}

	public String getUsualFare() {
		return usualFare;
	}

	public void setUsualFare(String usualFare) {
		this.usualFare = usualFare;
	}
	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public String getCardNo() {
		return cardId;
	}

	public void setCardNo(String cardNo) {
		this.cardId = cardNo;
	}

	public void setUsualTravelStation(String usualTravelStation) {
		this.usualTravelStation = usualTravelStation;
	}

	public String getUsualTravelStation() {
		return usualTravelStation;
	}

}
