package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Ketchup;

public class TomatoKetchup implements Ketchup {
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
}
