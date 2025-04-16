package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.*;

public class Vada implements Grapes, Candy, Clip, Bangle, Lipstick {
    @Override
    public void harvest() {
        System.out.println("Harvesting fresh red grapes");
    }

    @Override
    public void pack() {
        System.out.println("Packing red grapes in boxes");
    }

    @Override
    public void sell() {
        System.out.println("Selling red grapes at the market");
    }
    @Override
    public void make() {
        System.out.println("Making colorful lollipops");
    }

    @Override
    public void wrap() {
        System.out.println("Wrapping the lollipops in colorful paper");
    }

    @Override
    public void distribute() {
        System.out.println("Distributing lollipops to kids");
    }
    @Override
    public void attach() {
        System.out.println("Clip attached");
    }

    @Override
    public void secure() {
        System.out.println("Clip secured");
    }

    @Override
    public void remove() {
        System.out.println("Removing from Clip, Bangle, and Lipstick");
    }

    @Override
    public void wear() {
        System.out.println("Wearing bangle");
    }

    @Override
    public void shine() {
        System.out.println("Shining bangle");
    }

    @Override
    public void apply() {
        System.out.println("Applying lipstick");
    }

    @Override
    public void checkColor() {
        System.out.println("Checking lipstick color");
    }
}
