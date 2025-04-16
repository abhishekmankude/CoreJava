package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Bubble;
import com.xworkz.interfaceClass.internal.Dance;

public class Song implements Dance, Bubble {
    @Override
    public void perform() {
        System.out.println("Performing a ballet dance on stage");
    }

    @Override
    public void practice() {
        System.out.println("Practicing ballet dance moves");
    }

    @Override
    public void choreograph() {
        System.out.println("Choreographing a new ballet performance");
    }
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
