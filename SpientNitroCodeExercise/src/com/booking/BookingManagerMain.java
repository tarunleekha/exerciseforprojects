package com.booking;

import com.booking.domain.BookingRequest;
import com.booking.literals.BookingLiterals;
import com.booking.manager.BookingManager;

import java.util.Map;
import java.util.Set;

/**
 * Created by Saurabh on 08/04/2015.
 */
public class BookingManagerMain {

    public static void main(String[] arg) {
        BookingManager bookingManager = new BookingManager();
        Set<BookingRequest> bookingRequestList = BookingLiterals.populateBookingRequest();
        Map<String, String> bookingToCabMap = bookingManager.assignCab(bookingRequestList);

        for (String key : bookingToCabMap.keySet()) {

            System.out.println(key + "\t" + bookingToCabMap.get(key));

        }

    }
}
