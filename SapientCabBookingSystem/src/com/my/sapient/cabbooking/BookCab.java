package com.my.sapient.cabbooking;

import java.util.ArrayList;
import java.util.List;

public class BookCab {
	
	 
	public static void main(String[] args) {
		
			final List<BookingRequest> batch = new ArrayList<BookingRequest>();
			final BookingRequest request1 = new BookingRequest();
			request1.setRequestId("BR001");
			request1.setPickupAreaCode("100025");
			request1.setDropAreaCode("100036");
			request1.setPickupTime("2015-07-27 21:00:00");
			final BookingRequest request2 = new BookingRequest();
			request2.setRequestId("BR002");
			request2.setPickupAreaCode("100056");
			request2.setDropAreaCode("100042");
			request2.setPickupTime("2015-07-27 22:00:00");
			final BookingRequest request3 = new BookingRequest();
			request3.setRequestId("BR003");
			request3.setPickupAreaCode("100044");
			request3.setDropAreaCode("100056");
			request3.setPickupTime("2015-07-27 23:00:00");
			final BookingRequest request4 = new BookingRequest();
			request4.setRequestId("BR004");
			request4.setPickupAreaCode("100028");
			request4.setDropAreaCode("100036");
			request4.setPickupTime("2015-07-27 23:30:00");
			batch.add(request1);
			batch.add(request2);
			batch.add(request3);
			batch.add(request4);
			
			for(final BookingRequest request : batch){
				final CabFinder finder = new CabFinder();
				finder.initializeCabs();
				final CabInfo cab = finder.getSuitableCab(request);
				System.out.println("For booking id"+request.getRequestId()+"suitable cab is"+cab.getCabNo());
			}
	}	
}
