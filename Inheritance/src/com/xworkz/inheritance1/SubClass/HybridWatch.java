package com.xworkz.inheritance1.SubClass;

import com.xworkz.inheritance1.SuperClass.Watch;

public class HybridWatch extends Watch {
    public HybridWatch() {
        System.out.println("HybridWatch is running in HybridWatch");
    }
@Override
public void time() {
    System.out.println("Time function is running in HybridWatch");
}

    public void display() {
        System.out.println("Display is running in HybridWatch");
    }

    public void battery() {
        System.out.println("Battery is running in HybridWatch");
    }

    public void brand() {
        System.out.println("Brand is running in HybridWatch");
    }

    public void price() {
        System.out.println("Price is running in HybridWatch");
    }
}