package com.booking.domain;

import java.util.Date;

/**
 * Created by Saurabh on 08/04/2015.
 */
public class BookingRequest /*implements Comparable<BookingRequest>*/ {

    private String bookingId;
    private int pickUpArea;
    private int dropArea;
    private Date pickUpTime;

    public BookingRequest(String bookingId, int pickUpArea, int dropArea, Date pickUpTime) {
        this.bookingId = bookingId;
        this.pickUpArea = pickUpArea;
        this.dropArea = dropArea;
        this.pickUpTime = pickUpTime;
    }

    public String getBookingId() {
        return bookingId;
    }

    public int getPickUpArea() {
        return pickUpArea;
    }

    public int getDropArea() {
        return dropArea;
    }

    public Date getPickUpTime() {
        return pickUpTime;
    }


    /*@Override
    public int compareTo(BookingRequest br) {
        BookingRequest request = br;
        return this.getPickUpTime().compareTo(request.getPickUpTime());
    }*/
}
