package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Bed;

public class KingSizeBed implements Bed {
    @Override
    public void layDown() {
        System.out.println("Laying down on the king-size bed");
    }

    @Override
    public void make() {
        System.out.println("Making the king-size bed");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping on the king-size bed");
    }
}
