package com.xworkz.inheritance1.SubClass;


import com.xworkz.inheritance1.SuperClass.Watch;

public class SmartWatch extends Watch {
    public SmartWatch() {
        System.out.println("SmartWatch is running in SmartWatch");
    }
@Override
public void time() {
    System.out.println("Time function is running in SmartWatch");
}

    public void display() {
        System.out.println("Display is running in SmartWatch");
    }

    public void battery() {
        System.out.println("Battery is running in SmartWatch");
    }

    public void brand() {
        System.out.println("Brand is running in SmartWatch");
    }

    public void price() {
        System.out.println("Price is running in SmartWatch");
    }
}