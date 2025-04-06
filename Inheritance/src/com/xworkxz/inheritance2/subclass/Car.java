package com.xworkxz.inheritance2.subclass;

import com.xworkxz.inheritance2.superclass.Vehicle;

public class Car extends Vehicle {
    public Car() { System.out.println("Car constructor"); }
    @Override
    public void start() { System.out.println("Car starting"); }
    public void stop() { System.out.println("Car stopping"); }
    public void accelerate() { System.out.println("Car accelerating"); }
    public void brake() { System.out.println("Car braking"); }
    public void honk() { System.out.println("Car honking"); }


}