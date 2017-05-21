package com.my.flight.search;

import java.io.FileNotFoundException;
import java.util.List;

public interface FlightSearchDAO {

	public List<FlightSearchDTO> searchFlightPrepare(String dirLocation) throws FlightNotFoundException, FileNotFoundException;
	public List<FlightSearchDTO> searchFlightResult(String depLoc,
			   String arrLoc, String flightDate, String outPref,String dirLocation)
			   throws FlightNotFoundException, FileNotFoundException;
	
	
}
