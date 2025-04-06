package com.xworkz.inheritance1.SubClass;

import com.xworkz.inheritance1.SuperClass.Vehicle;

public class Truck extends Vehicle {

    public Truck(){
        System.out.println("Truck is running in Truck ");
    }
@Override
public void engine() {
    System.out.println("engine() is running in Truck");
}

    public void wheels() {
        System.out.println("wheels() is running in Truck");
    }

    public void color() {
        System.out.println("color() is running in Truck");
    }

    public void brand() {
        System.out.println("brand() is running in Truck");
    }

    public void price() {
        System.out.println("price() is running in Truck");
    }
}
