package com.my.general;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class UserInputTaker {
	public static void main(String[] args) {
		//Performing programme for getting nested inputs
    	String searchOptionValue = "yes";
        try {
        	while(searchOptionValue.equalsIgnoreCase("yes")){
        		final Validator validateSystem = new Validator();
            	System.out.println("Enter the swipe in  station");
        		BufferedReader swipeInName = new BufferedReader(new InputStreamReader(System.in));
                String sourceStation=swipeInName.readLine();
        		System.out.println("Enter the swipe out station");
        		BufferedReader swipeOutName = new BufferedReader(new InputStreamReader(System.in));
    			String destStation = swipeOutName.readLine();
    			System.out.println("Enter weekend or weekday");
        		BufferedReader weekChoice = new BufferedReader(new InputStreamReader(System.in));
    			String weekValue=weekChoice.readLine();
    			Calendar calendar = Calendar.getInstance();
    			int day = calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH); 
    			System.out.println("Day of week is "+day);
    			System.out.println("Type Item to Search ");
    	        System.out.println("1 File");
    	        System.out.println("2 Folder ");
    	        System.out.println("3 Both");
    	        System.out.println("0 Exit");
    	        BufferedReader item = new BufferedReader(new InputStreamReader(System.in));
                String itemName=item.readLine();
                if(itemName.equalsIgnoreCase("0")){
                	return;
                }
    			if(!validateSystem.isMinBalPresent(100)){
    				System.out.println("Card is not having sufficeient balance to exit from station");
    				return;
    			}
    			System.out.println("Do you want to travel more");
				BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
				searchOptionValue =input.readLine();
        	}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
