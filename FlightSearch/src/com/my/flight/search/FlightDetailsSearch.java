package com.my.flight.search;

import java.io.FileNotFoundException;
import java.util.List;

public class FlightDetailsSearch {
	
	public static void main(String[] args) {
		
		final FlightSearchDAO searchDao = new FlightSearchDAOImpl();
		try {
			final List<FlightSearchDTO> searchedDto =  searchDao.searchFlightResult("DEL", "AMS", "30-11-2010", "ASC", "C://Users//tarun//Desktop//dirlocation//");
			for(final FlightSearchDTO dto:searchedDto){
				System.out.println(dto.getDepartureLoccation());
				System.out.println(dto);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FlightNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
