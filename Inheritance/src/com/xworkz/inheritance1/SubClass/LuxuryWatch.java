package com.xworkz.inheritance1.SubClass;

import com.xworkz.inheritance1.SuperClass.Watch;

public class LuxuryWatch extends Watch {
    public LuxuryWatch() {
        System.out.println("LuxuryWatch is running in LuxuryWatch");
    }
@Override
public void time() {
    System.out.println("Time function is running in LuxuryWatch");
}

    public void display() {
        System.out.println("Display is running in LuxuryWatch");
    }

    public void battery() {
        System.out.println("Battery is running in LuxuryWatch");
    }

    public void brand() {
        System.out.println("Brand is running in LuxuryWatch");
    }

    public void price() {
        System.out.println("Price is running in LuxuryWatch");
    }
}