package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.*;

public class Pin implements Chats, Noodles, Mall, Zudio, Dance {
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
    public void design() {
        System.out.println("Designing new collections");
    }

    @Override
    public void display() {
        System.out.println("Displaying products");
    }

    @Override
    public void discount() {
        System.out.println("Offering discounts");
    }
    @Override
    public void open() {
        System.out.println("Opening the shopping mall");
    }

    @Override
    public void close() {
        System.out.println("Closing the shopping mall");
    }

    @Override
    public void offerDeals() {
        System.out.println("Offering deals and discounts at the shopping mall");
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
}
