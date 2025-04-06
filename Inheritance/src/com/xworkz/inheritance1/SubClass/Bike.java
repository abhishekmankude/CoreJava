package com.xworkz.inheritance1.SubClass;

import com.xworkz.inheritance1.SuperClass.Vehicle;

public class Bike extends Vehicle {
    public Bike()
    {
        System.out.println("Bike is running in Bike");
    }
@Override
public void engine() {
    System.out.println("engine() is running in Bike");
}

    public void wheels() {
        System.out.println("wheels() is running in Bike");
    }

    public void color() {
        System.out.println("color() is running in Bike");
    }

    public void brand() {
        System.out.println("brand() is running in Bike");
    }

    public void price() {
        System.out.println("price() is running in Bike");
    }
}
