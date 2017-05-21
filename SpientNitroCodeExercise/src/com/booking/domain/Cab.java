package com.booking.domain;

/**
 * Created by Saurabh on 08/04/2015.
 */
public class Cab {

    private String cabNumber;
    private int cabLocation;
    private boolean isOccupied;

    public Cab(String cabNumber, int cabLocation,boolean isOccupied) {
        this.cabNumber = cabNumber;
        this.cabLocation = cabLocation;
        this.isOccupied = isOccupied;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean isOccupied) {
        this.isOccupied = isOccupied;
    }

    public String getCabNumber() {
        return cabNumber;
    }

    public int getCabLocation() {
        return cabLocation;
    }

}
