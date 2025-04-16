package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Barbie;
import com.xworkz.interfaceClass.internal.Max;

public class Pant implements Barbie, Max {
    @Override
    public void dressUp() {
        System.out.println("Dressing up the Barbie doll");
    }

    @Override
    public void play() {
        System.out.println("Playing with the Barbie doll");
    }

    @Override
    public void collect() {
        System.out.println("Collecting different Barbie dolls");
    }
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
