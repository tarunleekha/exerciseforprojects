package com.my.sapientexercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MetroCardSystem {
	
	public void processJourneyData(CardInfo cardInfo,Map<String, Integer> footFallMap) {
    	processTravelData(cardInfo, "yes",footFallMap);
	}
	public void processTravelData(final CardInfo cardInfo ,String travelValue,Map<String, Integer> footFallMap){
		  try {
	        	while(travelValue.equalsIgnoreCase("yes")){
	        		final ValidateSystem validateSystem = new ValidateSystem();
	            	System.out.println("Enter the swipe in  station");
	        		BufferedReader swipeInName = new BufferedReader(new InputStreamReader(System.in));
	                String swipeInStation=swipeInName.readLine();
	                if(!validateSystem.validateStationInput(swipeInStation)){
	                	System.out.println("Not a Valid Station Name");
	                	travelValue = "yes";
	                	continue;
	                }else{
	                	footFallMap.put(swipeInStation, footFallMap.get(swipeInStation)+1);
	                }
	        		System.out.println("Enter the swipe out station");
	        		BufferedReader swipeOutName = new BufferedReader(new InputStreamReader(System.in));
	    			String swipeOutStation = swipeOutName.readLine();
	    			if(!validateSystem.validateStationInput(swipeOutStation)){
	    				System.out.println("Not a Valid Station Name");
	    				travelValue = "yes";
	    				continue;
	    			}else{
	                	footFallMap.put(swipeOutStation, footFallMap.get(swipeOutStation)+1);
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
	    			final float calculatedValue = calculator.calculateStationFare(swipeInStation, swipeOutStation, weekValue);
	    			final float balAmt = cardInfo.getBalance()- calculatedValue ;
	    			final Map<String,Integer> stationMap = cardInfo.getStationMapCount();
	    			String toFromValue = swipeInStation+"to"+swipeOutStation; 
	    			if(stationMap.containsKey(toFromValue)){
	    				stationMap.put(toFromValue, stationMap.get(toFromValue)+1);
	    			}else{
	    				stationMap.put(toFromValue, 1);
	    			}
	    			if(!validateSystem.isMinBalPresent(balAmt)){
	    				System.out.println("Card is not having sufficeient balance to exit from station");
	    				return;
	    			}
	    			cardInfo.setBalance(balAmt);
	    			System.out.println("Balance Amount is "+cardInfo.getBalance());
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
	
	public void addCardEntry(String cardValue,Map<String, CardInfo> cardMapper){
		final CardInfo card1 = new CardInfo();
		card1.setBalance(50);
		card1.setCardNo(cardValue);
		card1.setUsualTravelStation("A1A3");
		card1.setUsualFare("14");
		card1.setStationMapCount(new HashMap<String, Integer>());
		cardMapper.put(cardValue, card1);
	}

}
