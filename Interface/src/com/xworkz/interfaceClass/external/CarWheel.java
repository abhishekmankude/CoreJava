package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Wheel;

public class CarWheel implements Wheel {
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
