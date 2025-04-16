package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Fan;
import com.xworkz.interfaceClass.internal.Juice;

public class Rose implements Fan, Juice {
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
    @Override
    public void squeeze() {
        System.out.println("Squeezing fresh oranges for juice");
    }

    @Override
    public void mix() {
        System.out.println("Mixing the juice with a hint of sweetness");
    }

    @Override
    public void serve() {
        System.out.println("Serving the refreshing orange juice");
    }

}
