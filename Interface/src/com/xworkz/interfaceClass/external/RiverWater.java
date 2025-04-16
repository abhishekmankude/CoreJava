package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Water;

public class RiverWater implements Water {
    @Override
    public void flow() {
        System.out.println("Water is flowing in the river");
    }

    @Override
    public void purify() {
        System.out.println("Purifying the river water");
    }

    @Override
    public void store() {
        System.out.println("Storing water in a reservoir");
    }
}
