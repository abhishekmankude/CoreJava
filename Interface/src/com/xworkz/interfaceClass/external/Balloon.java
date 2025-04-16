package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Bubble;
import com.xworkz.interfaceClass.internal.Ice;
import com.xworkz.interfaceClass.internal.Dance;
import com.xworkz.interfaceClass.internal.Mobile;
import com.xworkz.interfaceClass.internal.Zudio;

public class Balloon implements Bubble, Ice, Dance, Mobile, Zudio {

    // Bubble methods
    @Override
    public void create() {
        System.out.println("Creating balloon-like bubbles at a party");
    }

    @Override
    public void pop() {
        System.out.println("Popping a colorful balloon");
    }

    @Override
    public void floatInAir() {
        System.out.println("Watching the balloon float high in the air");
    }

    // Ice methods
    @Override
    public void freeze() {
        System.out.println("Freezing water balloons for a summer game");
    }

    @Override
    public void store() {
        System.out.println("Storing frozen balloons in the cooler");
    }

    @Override
    public void melt() {
        System.out.println("The icy balloon starts melting in the heat");
    }

    // Dance methods
    @Override
    public void perform() {
        System.out.println("Performing a balloon-themed dance show");
    }

    @Override
    public void practice() {
        System.out.println("Practicing with balloons in dance rehearsal");
    }

    @Override
    public void choreograph() {
        System.out.println("Choreographing a dance using balloons as props");
    }

    // Mobile methods
    @Override
    public void makeCall() {
        System.out.println("Pretending to make a call using a balloon phone");
    }

    @Override
    public void sendMessage() {
        System.out.println("Sending balloon messages in a party game");
    }

    @Override
    public void browseInternet() {
        System.out.println("Browsing balloon decor ideas online");
    }

    // Zudio methods
    @Override
    public void design() {
        System.out.println("Designing balloon print clothes for Zudio");
    }

    @Override
    public void display() {
        System.out.println("Displaying balloon-inspired designs in the store");
    }

    @Override
    public void discount() {
        System.out.println("Offering discounts on balloon-themed fashion");
    }
}
