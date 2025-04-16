package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Petrol;
import com.xworkz.interfaceClass.internal.Wheel;

public class Garden implements Petrol, Wheel {
    @Override
    public void fuelEngine() {
        System.out.println("Filling petrol into the car engine");
    }

    @Override
    public void checkLevel() {
        System.out.println("Checking the petrol level in the car");
    }

    @Override
    public void refill() {
        System.out.println("Refilling the petrol tank");
    }
    @Override
    public void rotate() {
        System.out.println("Rotating the car wheel");
    }

    @Override
    public void inflate() {
        System.out.println("Inflating the car wheel");
    }

    @Override
    public void repair() {
        System.out.println("Repairing the car wheel");
    }
}
