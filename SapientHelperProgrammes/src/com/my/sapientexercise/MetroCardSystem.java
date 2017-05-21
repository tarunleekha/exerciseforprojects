package com.my.sapientexercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;

public class MetroCardSystem {
	
	public static void main(String[] args) {
		final CardInfo cardInfo = new CardInfo();
       	cardInfo.setBalance(100);
    	cardInfo.setCardNo("C1");
    	String travelValue = "yes";
    	final MetroCardSystem metroSystem = new MetroCardSystem();
    	final FootFallOperations footFall = new FootFallOperations();
    	footFall.initializeStationNameMap();
    	footFall.initializeStationIndex();
    	footFall.initializeDepartureList();
    	footFall.initializeArrivalList();
		footFall.initializeFootFallMap();
    	metroSystem.processTravelData(cardInfo, travelValue,footFall);
	}
	
	public FootFallOperations processFootFall(final String cardName){
		final CardInfo cardInfo = new CardInfo();
       	cardInfo.setBalance(100);
    	cardInfo.setCardNo(cardName);
    	String travelValue = "yes";
    	final MetroCardSystem metroSystem = new MetroCardSystem();
    	final FootFallOperations footFall = new FootFallOperations();
    	footFall.initializeStationNameMap();
    	footFall.initializeStationIndex();
    	footFall.initializeDepartureList();
    	footFall.initializeArrivalList();
		footFall.initializeFootFallMap();
    	metroSystem.processTravelData(cardInfo, travelValue,footFall);
    	return footFall;
	}
	
	public CardInfo processPerCardReport(final String cardName){
		final CardInfo cardInfo = new CardInfo();
    	String travelValue = "yes";
    	final MetroCardSystem metroSystem = new MetroCardSystem();
    	final FootFallOperations footFall = new FootFallOperations();
    	footFall.initializeStationNameMap();
    	footFall.initializeStationIndex();
    	footFall.initializeDepartureList();
    	footFall.initializeArrivalList();
		footFall.initializeFootFallMap();
    	metroSystem.processTravelData(cardInfo, travelValue,footFall);
    	Collections.sort(footFall.getSourceCountList());
    	Collections.sort(footFall.getDestinationCountList());
    	int sourceIndex = footFall.getSourceCountList().get(footFall.getSourceCountList().size()-1);
    	int destinationIndex = footFall.getDestinationCountList().get(footFall.getDestinationCountList().size()-1);
    	cardInfo.setUsualSourceStation(footFall.getStationIndexMap().get(sourceIndex));
    	cardInfo.setUsualDestinationStation(footFall.getStationIndexMap().get(destinationIndex));
    	return cardInfo;
	}
	
	public void processTravelData(final CardInfo cardInfo ,String travelValue,final FootFallOperations footFall){
		  try {
	        	while(travelValue.equalsIgnoreCase("yes")){
	        		final ValidateSystem validateSystem = new ValidateSystem();
	            	System.out.println("Enter the swipe in  station");
	        		BufferedReader swipeInName = new BufferedReader(new InputStreamReader(System.in));
	                String sourceStation=swipeInName.readLine();
	                if(!validateSystem.validateStationInput(sourceStation)){
	                	System.out.println("Not a Valid Station Name");
	                	travelValue = "yes";
	                	continue;
	                }
	        		System.out.println("Enter the swipe out station");
	        		BufferedReader swipeOutName = new BufferedReader(new InputStreamReader(System.in));
	    			String destStation = swipeOutName.readLine();
	    			if(!validateSystem.validateStationInput(destStation)){
	    				System.out.println("Not a Valid Station Name");
	    				travelValue = "yes";
	    				continue;
	    			}
	    			System.out.println("Enter weekend or weekday");
	        		BufferedReader weekChoice = new BufferedReader(new InputStreamReader(System.in));
	    			String weekValue=weekChoice.readLine();
	    			if(!validateSystem.validateWeekChoice(weekValue)){
	    				System.out.println("Not a Valid Week Choice");
	    				travelValue = "yes";
	    				continue;
	    			}
	    			if(!validateSystem.isMinBalPresent(cardInfo.getBalance())){
	    				System.out.println("Minimum Balance Not present");
	    				return;
	    			}
	    			final FareCalculator calculator = new FareCalculator();
	    			final float calculatedValue = calculator.calculateStationFare(sourceStation, destStation, weekValue);
	    			final float balAmt = cardInfo.getBalance()- calculatedValue ;
	    			if(!validateSystem.isMinBalPresent(balAmt)){
	    				System.out.println("Card is not having sufficeient balance to exit from station");
	    				return;
	    			}
	    			cardInfo.setBalance(balAmt);
	    			System.out.println("Balance Amount is "+cardInfo.getBalance());
	    			footFall.incrementSourceCount(footFall.getStationNameMap().get(sourceStation));
	    			footFall.incrementDestinationCount(footFall.getStationNameMap().get(destStation));
	    			footFall.incrementFootFall(sourceStation);
	    			footFall.incrementFootFall(destStation);
	    			System.out.println("Do you want to travel more");
					BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
					travelValue =input.readLine();
	        	}
			} catch (IOException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}catch (Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
	}

}
