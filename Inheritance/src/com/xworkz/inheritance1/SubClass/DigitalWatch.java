package com.xworkz.inheritance1.SubClass;


import com.xworkz.inheritance1.SuperClass.Watch;

public class DigitalWatch extends Watch {
    public DigitalWatch() {
        System.out.println("DigitalWatch is running in DigitalWatch");
    }
@Override
public void time() {
    System.out.println("Time function is running in DigitalWatch");
}

    public void display() {
        System.out.println("Display is running in DigitalWatch");
    }

    public void battery() {
        System.out.println("Battery is running in DigitalWatch");
    }

    public void brand() {
        System.out.println("Brand is running in DigitalWatch");
    }

    public void price() {
        System.out.println("Price is running in DigitalWatch");
    }
}