package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Frame;
import com.xworkz.interfaceClass.internal.Ketchup;

public class Balm implements Ketchup, Frame {
    @Override
    public void squeeze() {
        System.out.println("Squeezing ketchup from the bottle");
    }

    @Override
    public void dip() {
        System.out.println("Dipping fries into ketchup");
    }

    @Override
    public void store() {
        System.out.println("Storing the ketchup bottle in the fridge");
    }
    @Override
    public void design() {
        System.out.println("Designing a beautiful photo frame");
    }

    @Override
    public void assemble() {
        System.out.println("Assembling the components of the photo frame");
    }

    @Override
    public void display() {
        System.out.println("Displaying the photo frame with a picture");
    }
}
