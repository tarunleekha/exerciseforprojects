package com.booking.manager;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Assert;
import org.junit.Test;

import com.booking.domain.BookingRequest;
import com.booking.literals.BookingLiterals;

/**
 * Created by Saurabh on 08/04/2015.
 */
public class BookingManagerTest {

	@Test
	public void cabAssignedSuccessfully() {
		DateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		try {
			BookingRequest bookingRequest = new BookingRequest("BR001", 100025, 100036, sdf.parse("04-09-2015 22:00:00"));
			Set<BookingRequest> bookingRequestList = new TreeSet<BookingRequest>();
			bookingRequestList.add(bookingRequest);
			BookingManager bookingManager = new BookingManager();
			Map<String, String> bookingMap = bookingManager.assignCab(bookingRequestList);
			String bookingStatus = bookingMap.get("BR001");
			boolean isBookingSuccess = !(bookingStatus.equals(BookingLiterals.BOOKING_NON_PROFITABLE) 
					|| bookingStatus.equals(BookingLiterals.CAB_CANT_REACH_ON_TIME)
					|| bookingStatus.equals(BookingLiterals.NO_CAB_AVAILABLE));
			Assert.assertTrue(isBookingSuccess);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	
	@Test
	public void cabNotAssignedSuccessfully() {
		DateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		try {
			BookingRequest bookingRequest = new BookingRequest("BR002", 100025, 100036, sdf.parse("04-09-2015 22:00:00"));
			Set<BookingRequest> bookingRequestList = new TreeSet<BookingRequest>();
			bookingRequestList.add(bookingRequest);
			BookingManager bookingManager = new BookingManager();
			Map<String, String> bookingMap = bookingManager.assignCab(bookingRequestList);
			String bookingStatus = bookingMap.get("BR002");
			boolean isBookingSuccess = !(bookingStatus.equals(BookingLiterals.BOOKING_NON_PROFITABLE) 
					|| bookingStatus.equals(BookingLiterals.CAB_CANT_REACH_ON_TIME)
					|| bookingStatus.equals(BookingLiterals.NO_CAB_AVAILABLE));
			Assert.assertFalse(isBookingSuccess);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
