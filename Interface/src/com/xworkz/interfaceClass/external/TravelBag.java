package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Bag;

public class TravelBag implements Bag {
    @Override
    public void pack() {
        System.out.println("Packing items into the travel bag");
    }

    @Override
    public void carry() {
        System.out.println("Carrying the travel bag");
    }

    @Override
    public void unpack() {
        System.out.println("Unpacking items from the travel bag");
    }
}
