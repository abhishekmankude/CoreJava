package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.*;

public class Snake implements Mobile, Ice, Dance, Bubble, Weather {
    @Override
    public void makeCall() {
        System.out.println("Making a call from the smartphone");
    }

    @Override
    public void sendMessage() {
        System.out.println("Sending a message from the smartphone");
    }

    @Override
    public void browseInternet() {
        System.out.println("Browsing the internet on the smartphone");
    }
    @Override
    public void freeze() {
        System.out.println("Freezing water into ice cubes");
    }

    @Override
    public void store() {
        System.out.println("Storing ice cubes in the freezer");
    }

    @Override
    public void melt() {
        System.out.println("Melting the ice cubes");
    }
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
    @Override
    public void change() {
        System.out.println("The weather is changing as seasons shift");
    }

    @Override
    public void forecast() {
        System.out.println("Forecasting the weather for the upcoming days");
    }

    @Override
    public void stabilize() {
        System.out.println("The weather is stabilizing after the storm");
    }
}
