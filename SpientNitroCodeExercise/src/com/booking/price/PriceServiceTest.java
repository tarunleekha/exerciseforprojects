package com.booking.price;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Created by Saurabh on 08/04/2015.
 */
public class PriceServiceTest {
	
	@Test
	public void cabBookedIsProfitable(){
		int distanceToReachPickUp = 8;
		int commuteDistance = 14;
		PriceService priceService = new PriceService();
		assertTrue(priceService.isProfitableFor(distanceToReachPickUp, commuteDistance));
	}
	
	@Test
	public void cabBookedIsNotProfitable(){
		int distanceToReachPickUp = 32;
		int commuteDistance = 8;
		PriceService priceService = new PriceService();
		assertFalse(priceService.isProfitableFor(distanceToReachPickUp, commuteDistance));
	}

}
