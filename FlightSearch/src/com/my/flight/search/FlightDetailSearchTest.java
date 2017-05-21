package com.my.flight.search;

import static org.junit.Assert.assertEquals;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FlightDetailSearchTest {

	final List<FlightSearchDTO> mockDtoList = new ArrayList<FlightSearchDTO>();
	
	@Before
	public void setUp() throws Exception {
		mockDtoList.add(new FlightSearchDTO("LH348", "DEL", "AMS", "30-11-2010","2325" , "11.00", "1050"));
		mockDtoList.add(new FlightSearchDTO("LH349", "DEL", "AMS", "30-11-2010","2326" , "12.00", "1051"));
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testSearchFlightResult() {
		final FlightSearchDAO searchDao = new FlightSearchDAOImpl();
		try {
			final List<FlightSearchDTO> searchedDto = searchDao.searchFlightResult("DEL", "AMS", "30-11-2010", "ASC", "C://Users//tarun//Desktop//dirlocation//");
			for(int i =0 ; i < searchedDto.size();i++ ){
				assertEquals(mockDtoList.get(i).toString(), searchedDto.get(i).toString());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (FlightNotFoundException e) {
			e.printStackTrace();
		}
	}
}
