package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Max;

public class MaxValue implements Max {
    @Override
    public void calculate() {
        System.out.println("Calculating the maximum value");
    }

    @Override
    public void display() {
        System.out.println("Displaying the maximum value");
    }

    @Override
    public void reset() {
        System.out.println("Resetting the maximum value");
    }
}
