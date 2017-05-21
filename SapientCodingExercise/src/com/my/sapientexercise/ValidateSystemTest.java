package com.my.sapientexercise;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ValidateSystemTest {
	private ValidateSystem validator;

	@Before
	public void setUp() throws Exception {
		validator = new ValidateSystem();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIsMinBalPresent() {
		boolean isMinBalPresent  =  validator.isMinBalPresent(10);
		assertEquals(true, isMinBalPresent);
	}
	
	@Test
	public void testValidateStationInput() throws Exception {
		boolean isStationValid  =  validator.validateStationInput("A10");
		assertEquals(true, isStationValid);
	}
	
	@Test
	public void testValidateWeekChoice() {
		boolean isWeekValid = validator.validateWeekChoice("weekday");
		assertEquals(true, isWeekValid);
	}
}
