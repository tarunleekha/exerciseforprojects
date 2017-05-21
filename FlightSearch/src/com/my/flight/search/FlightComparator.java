package com.my.flight.search;

import java.util.Comparator;

public class FlightComparator implements Comparator<FlightSearchDTO> {

	private String outputPref;
	
	@Override
	public int compare(FlightSearchDTO dto1, FlightSearchDTO dto2) {
		if(getOutputPref().equalsIgnoreCase("ASC")){
			return dto1.getDepartureLoccation().compareTo(dto2.getDepartureLoccation());
		}else{
			return dto2.getDepartureLoccation().compareTo(dto1.getDepartureLoccation());
		}
		
	}

	public void setOutputPref(String outputPref) {
		this.outputPref = outputPref;
	}

	public String getOutputPref() {
		return outputPref;
	}

	
}
