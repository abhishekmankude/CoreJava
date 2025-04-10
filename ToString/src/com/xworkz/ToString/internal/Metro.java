package com.xworkz.ToString.internal;

public class Metro {
    private String city;
    private String lineColor;
    private int ticketPrice;

    public Metro(String city, String lineColor, int ticketPrice) {
        this.city = city;
        this.lineColor = lineColor;
        this.ticketPrice = ticketPrice;
    }

    @Override
    public String toString() {
        return "Metro city " + this.city + " line color " + this.lineColor + " ticket price " + this.ticketPrice;
    }
    @Override
    public int hashCode()
    {
        super.hashCode();
        return 100;

    }}
