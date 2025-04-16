package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Button;
import com.xworkz.interfaceClass.internal.Fan;

public class Print implements Button, Fan {

    @Override
    public void press() {
        System.out.println("Print button is pressed.");
    }

    @Override
    public void release() {
        System.out.println("Print button is released.");
    }

    @Override
    public void glow() {

    }

    @Override
    public void turnOn() {

    }

    @Override
    public void adjustSpeed() {

    }

    @Override
    public void turnOff() {

    }
}
