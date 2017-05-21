package com.my.sapientexercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MetroCardSystem {
	
	public static void main(String[] args) {
		final CardInfo cardInfo = new CardInfo();
       	cardInfo.setBalance(100);
    	cardInfo.setCardNo("C1");
    	String travelValue = "yes";
    	final MetroCardSystem metroSystem = new MetroCardSystem();
    	final FootFallOperations footFall = new FootFallOperations();
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
		footFall.initializeFootFallMap();
    	metroSystem.processTravelData(cardInfo, travelValue,footFall);
    	return footFall;
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
