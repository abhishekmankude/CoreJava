package com.xworkz.inheritance1.SubClass;

import com.xworkz.inheritance1.SuperClass.Watch;

public class AnalogWatch extends Watch {
    public AnalogWatch() {
        System.out.println("AnalogWatch is running in AnalogWatch");
    }
@Override
public void time() {
    System.out.println("Time function is running in AnalogWatch");
}

    public void display() {
        System.out.println("Display is running in AnalogWatch");
    }

    public void battery() {
        System.out.println("Battery is running in AnalogWatch");
    }

    public void brand() {
        System.out.println("Brand is running in AnalogWatch");
    }

    public void price() {
        System.out.println("Price is running in AnalogWatch");
    }
}