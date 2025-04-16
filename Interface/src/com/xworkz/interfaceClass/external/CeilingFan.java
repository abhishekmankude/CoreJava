package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Fan;

public class CeilingFan implements Fan {
    @Override
    public void turnOn() {
        System.out.println("Turning on the ceiling fan");
    }

    @Override
    public void adjustSpeed() {
        System.out.println("Adjusting the speed of the ceiling fan");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off the ceiling fan");
    }
}
