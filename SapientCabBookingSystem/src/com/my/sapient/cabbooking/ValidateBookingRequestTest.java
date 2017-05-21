package com.my.sapient.cabbooking;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ValidateBookingRequestTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPickUpLocation() {
		final ValidateBoookingRequest validator = new ValidateBoookingRequest();
		boolean isValidPickupLocation  =  validator.validatePickupLocation("100002");
		assertEquals(true, isValidPickupLocation);
		
	}

	@Test()
	public void testDropLocation(){
		final ValidateBoookingRequest validator = new ValidateBoookingRequest();
		boolean isValidDropLocation  =  validator.validatePickupLocation("100002");
		assertEquals(true, isValidDropLocation);
	}
	
}
