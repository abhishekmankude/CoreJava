package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Dance;
import com.xworkz.interfaceClass.internal.Bubble;
import com.xworkz.interfaceClass.internal.Mobile;
import com.xworkz.interfaceClass.internal.Ice;
import com.xworkz.interfaceClass.internal.Zudio;

public class Cup implements Dance, Bubble, Mobile, Ice, Zudio {

    // Dance methods
    @Override
    public void perform() {
        System.out.println("Cup-themed performance in a graceful dance");
    }

    @Override
    public void practice() {
        System.out.println("Practicing cup balancing dance moves");
    }

    @Override
    public void choreograph() {
        System.out.println("Choreographing a dance with cups");
    }

    // Bubble methods
    @Override
    public void create() {
        System.out.println("Creating bubbles in a tea cup");
    }

    @Override
    public void pop() {
        System.out.println("Popping bubbles from a cup of milk");
    }

    @Override
    public void floatInAir() {
        System.out.println("Watching cup-formed bubbles float in the air");
    }

    // Mobile methods
    @Override
    public void makeCall() {
        System.out.println("Using a cup as a pretend phone to make a call");
    }

    @Override
    public void sendMessage() {
        System.out.println("Sending a message while sipping from a cup");
    }

    @Override
    public void browseInternet() {
        System.out.println("Browsing the internet while enjoying tea in a cup");
    }

    // Ice methods
    @Override
    public void freeze() {
        System.out.println("Freezing juice into an ice cup");
    }

    @Override
    public void store() {
        System.out.println("Storing the ice cups in the freezer");
    }

    @Override
    public void melt() {
        System.out.println("Melting ice slowly in the cup");
    }

    // Zudio methods
    @Override
    public void design() {
        System.out.println("Designing stylish cup prints for Zudio");
    }

    @Override
    public void display() {
        System.out.println("Displaying designer cups at the Zudio store");
    }

    @Override
    public void discount() {
        System.out.println("Giving discounts on cup-themed merchandise");
    }
}
