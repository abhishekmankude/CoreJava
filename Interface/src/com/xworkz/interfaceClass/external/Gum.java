package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Candy;
import com.xworkz.interfaceClass.internal.Bubble;

public class Gum implements Candy, Bubble {

    @Override
    public void make() {
        System.out.println("Making bubble gum with fruity flavor");
    }

    @Override
    public void wrap() {
        System.out.println("Wrapping gum in colorful foil");
    }

    @Override
    public void distribute() {
        System.out.println("Distributing gum to local stores");
    }

    @Override
    public void create() {
        System.out.println("Creating a bubble from gum");
    }

    @Override
    public void pop() {
        System.out.println("Bubble popped with a fun sound");
    }

    @Override
    public void floatInAir() {
        System.out.println("Bubble floats in the air briefly before popping");
    }
}
