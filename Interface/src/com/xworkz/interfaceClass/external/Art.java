package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.*;

public class Art implements Bed, Zoo, Color, Chats, Noodles {
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
    @Override
    public void displayAnimals() {
        System.out.println("Displaying various animals in the zoo");
    }

    @Override
    public void organizeTours() {
        System.out.println("Organizing guided tours for zoo visitors");
    }

    @Override
    public void conserveSpecies() {
        System.out.println("Conserving endangered species in the zoo");
    }
    @Override
    public void mix() {
        System.out.println("Mixing different paints to create a new color");
    }

    @Override
    public void apply() {
        System.out.println("Applying the paint color to the surface");
    }

    @Override
    public void fade() {
        System.out.println("The paint color starts to fade over time");
    }
    @Override
    public void boil() {
        System.out.println("Boiling the instant noodles");
    }

    @Override
    public void season() {
        System.out.println("Adding seasoning to the noodles");
    }

    @Override
    public void serve() {
        System.out.println("Serving the noodles in a bowl");
    }

    @Override
    public void sendMessage() {
        System.out.println("Sending a message on WhatsApp");
    }

    @Override
    public void receiveMessage() {
        System.out.println("Receiving a message on WhatsApp");
    }

    @Override
    public void shareFile() {
        System.out.println("Sharing a file on WhatsApp");
    }
}
