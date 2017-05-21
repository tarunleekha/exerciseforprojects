package com.my.sapientexercise;

import java.util.ArrayList;
import java.util.List;

public class PerCardReportAPI {
	
	public static void main(String[] args) {
		final List<CardInfo> cardInfoList  = new ArrayList<CardInfo>();
		final CardInfo card1 = new CardInfo();
		card1.setBalance(50);
		card1.setCardNo("C1");
		card1.setUsualSourceStation("A1");
		card1.setUsualDepartureStation("A3");
		cardInfoList.add(card1);
		//card1.setUsualFare(new FareCalculator().calculateStationFare(sourceStation, destStation, weekChoice));
		card1.setUsualFare("14");
		final CardInfo card2 = new CardInfo();
		card2.setBalance(53);
		card2.setCardNo("C2");
		card2.setUsualSourceStation("A1");
		card2.setUsualDepartureStation("A3");
		//card1.setUsualFare(new FareCalculator().calculateStationFare(sourceStation, destStation, weekChoice));
		card2.setUsualFare("14");
		cardInfoList.add(card2);
		final CardInfo card3 = new CardInfo();
		card3.setBalance(55);
		card3.setCardNo("C3");
		card3.setUsualSourceStation("A1");
		card3.setUsualDepartureStation("A3");
		//card1.setUsualFare(new FareCalculator().calculateStationFare(sourceStation, destStation, weekChoice));
		card3.setUsualFare("14");
		cardInfoList.add(card3);
		final CardInfo card4 = new CardInfo();
		card4.setBalance(52);
		card4.setCardNo("C4");
		card4.setUsualSourceStation("A1");
		card4.setUsualDepartureStation("A3");
		//card1.setUsualFare(new FareCalculator().calculateStationFare(sourceStation, destStation, weekChoice));
		card4.setUsualFare("14");
		cardInfoList.add(card4);
		
		for(final CardInfo card : cardInfoList){
			System.out.println("Card "+card.getCardNo()+" used to travel from station "+card.getUsualSourceStation()+"to station"+card.getUsualDepartureStation()+
					". Fare is Rs "+card.getUsualFare()+" and balance on card is Rs "+card.getBalance());
		}
		
		
	}

}
