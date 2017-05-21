package com.booking.literals;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.booking.domain.BookingRequest;
import com.booking.domain.Cab;

/**
 * Created by Saurabh on 08/04/2015.
 */
public class BookingLiterals {
	
	public static final String BOOKING_NON_PROFITABLE = "Booking not profitable";
	public static final String CAB_CANT_REACH_ON_TIME = "Cab can't reach on time";
	public static final String NO_CAB_AVAILABLE = "Cab not available";
	
	
    public static List<Cab> populateAvailableCabs() {
        List<Cab> cabList = new ArrayList<Cab>();
        Cab cabOne = new Cab("DL01HB001", 100020,false);
        Cab cabTwo = new Cab("DL01HB002", 100040,false);
        Cab cabThree = new Cab("DL01HB003", 100060,false);
        Cab cabFour = new Cab("DL01HB004", 100080,false);
        cabList.add(cabOne);
        cabList.add(cabTwo);
        cabList.add(cabThree);
        cabList.add(cabFour);
        return cabList;
    }

    public static Set<BookingRequest> populateBookingRequest() {
        Set<BookingRequest> bookingRequestList = new HashSet<>();
        DateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        try {
            BookingRequest bookingRequestOne = new BookingRequest("BR001", 100025, 100036, sdf.parse("20-05-2017 21:00:00"));
            BookingRequest bookingRequestTwo = new BookingRequest("BR002", 100056, 100042, sdf.parse("20-05-2017 20:30:00"));
            BookingRequest bookingRequestThree = new BookingRequest("BR003", 100044, 100056, sdf.parse("20-05-2017 22:00:00"));
            BookingRequest bookingRequestFour = new BookingRequest("BR004", 100028, 100036, sdf.parse("20-05-2017 23:00:00"));
            bookingRequestList.add(bookingRequestOne);
            bookingRequestList.add(bookingRequestTwo);
            bookingRequestList.add(bookingRequestThree);
            bookingRequestList.add(bookingRequestFour);
            
        } catch (ParseException e) {
            e.printStackTrace();
        }
       return bookingRequestList;
    }
}
