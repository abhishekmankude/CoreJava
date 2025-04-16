package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Bubble;

public class SoapBubble implements Bubble {
    @Override
    public void create() {
        System.out.println("Creating a soap bubble with a bubble wand");
    }

    @Override
    public void pop() {
        System.out.println("Popping the soap bubble");
    }

    @Override
    public void floatInAir() {
        System.out.println("Watching the soap bubble float in the air");
    }
}
