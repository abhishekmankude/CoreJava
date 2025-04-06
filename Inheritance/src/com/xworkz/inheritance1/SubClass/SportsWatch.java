package com.xworkz.inheritance1.SubClass;


import com.xworkz.inheritance1.SuperClass.Watch;

public class SportsWatch extends Watch {
    public SportsWatch() {
        System.out.println("SportsWatch is running in SportsWatch");
    }
@Override
public void time() {
    System.out.println("Time function is running in Watch");
}

    public void display() {
        System.out.println("Display is running in SportsWatch");
    }

    public void battery() {
        System.out.println("Battery is running in SportsWatch");
    }

    public void brand() {
        System.out.println("Brand is running in SportsWatch");
    }

    public void price() {
        System.out.println("Price is running in SportsWatch");
    }
}