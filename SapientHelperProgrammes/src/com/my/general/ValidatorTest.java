package com.my.general;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ValidatorTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIsMinBalPresent() {
		final Validator validator = new Validator();
		boolean isMinBalPresent  =  validator.isMinBalPresent(1);
		assertEquals(true, isMinBalPresent);
		
	}

	@Test(expected = Exception.class)
	public void testValidateStationInput() throws Exception {
		final Validator validator = new Validator();
		validator.validateStationInput("A67");
			
		
		
	}

	/*@Test
	public void testValidateWeekChoice() {
		fail("Not yet implemented");
	}*/

}
