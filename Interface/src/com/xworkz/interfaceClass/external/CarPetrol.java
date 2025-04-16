package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Petrol;

public class CarPetrol implements Petrol {
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
}
