package com.my.sapientexercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MetroOperator {

	private FootFallOperations footFall;
	private PerCardReport reportGenerator;
	private Map<String, CardInfo> cardMap;

	public static void main(String[] args) {
		System.out.println("Welcome to metro railways");
		try {
			String cardCheck = "yes";
			final MetroOperator metroOperator = new MetroOperator();
			final FootFallOperations footFallOperations = new FootFallOperations();
			footFallOperations.initializeFootFallMap();
			while (cardCheck.equalsIgnoreCase("yes")) {
				System.out.println("Enter Card ID");
				BufferedReader cardNoReader = new BufferedReader(
						new InputStreamReader(System.in));
				String cardId = cardNoReader.readLine();
				final MetroCardSystem metroCard = new MetroCardSystem();
				if(metroOperator.getCardMap()==null){
					metroOperator.setCardMap(new HashMap<String, CardInfo>());
				}
				if(metroOperator.getCardMap().get(cardId)== null){
					metroCard.addCardEntry(cardId, metroOperator.getCardMap());
				}
				CardInfo cardInfo = metroOperator.getCardMap().get(cardId);
				metroCard.processJourneyData(cardInfo,
						footFallOperations.getStationMap());
				PerCardReport reportGenerator = new PerCardReport();
				List<String> usualTravelStations = reportGenerator
						.getUsualTravelStation(cardInfo.getStationMapCount());
				System.out.println("Enter station name for calculating footfall");
				BufferedReader stationReader = new BufferedReader(
						new InputStreamReader(System.in));
				String stationName = stationReader.readLine();
				if(new ValidateSystem().validateStationInput(stationName)){
					footFallOperations.printFootFall(stationName);
				}else{
					System.out.println("Invalid station Name. Now generating report per card");
				}
				System.out.println("Enter card name for generating per card report");
				BufferedReader cardIdReader = new BufferedReader(
						new InputStreamReader(System.in));
				String requiredCardId = cardIdReader.readLine();
				CardInfo requiredCardInfo = metroOperator.getCardMap().get(requiredCardId);
				if(!(requiredCardInfo==null)){
					reportGenerator.printUsualStations(requiredCardInfo,
							usualTravelStations);
				}else{
					System.out.println(requiredCardId+"Not Found");
				}
				System.out.println("Do you want to travel with other card");
				BufferedReader reader = new BufferedReader(
						new InputStreamReader(System.in));
				String value = reader.readLine();
				cardCheck = value;
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		 * System.out.println("Please enter numbers for  below operations ");
		 * System.out.println("Enter 1 for travelling");
		 * System.out.println("Enter 2 for checking total foot fall ");
		 * System.out.println("Enter 3 for generating per card report API");
		 * System
		 * .out.println("Enter any other number to continue again with other id"
		 * ); System.out.println("Enter any other number to exit ");
		 */
		//
	}

	public void setCardMap(Map<String, CardInfo> cardMap) {
		this.cardMap = cardMap;
	}

	public Map<String, CardInfo> getCardMap() {
		return cardMap;
	}

	public void setReportGenerator(PerCardReport reportGenerator) {
		this.reportGenerator = reportGenerator;
	}

	public PerCardReport getReportGenerator() {
		return reportGenerator;
	}

	public void setFootFall(FootFallOperations footFall) {
		this.footFall = footFall;
	}

	public FootFallOperations getFootFall() {
		return footFall;
	}
}
