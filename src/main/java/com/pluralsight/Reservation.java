package com.pluralsight;

public class Reservation {

    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean weekend;

    public Reservation(String roomType, int numberOfNights, boolean weekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String getRoomType) {
        this.roomType = getRoomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }

    public double getPrice() {
        if (roomType.equalsIgnoreCase("King"))
            price = 139.00;
        else if (roomType.equalsIgnoreCase("Double")) {
            price = 124.00;
        }

        if (weekend) {
            price = price * 1.10;
        }

        return price;

    }

    public double getReservationTotal() {
        return getNumberOfNights() * getPrice();
    }
}
