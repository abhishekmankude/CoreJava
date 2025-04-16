package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.*;

public class Fork implements Petrol, Frame, Ketchup, Noodles, Chats {
    @Override
    public void fuelEngine() {
        System.out.println("Filling petrol into the car engine");
    }

    @Override
    public void checkLevel() {
        System.out.println("Checking the petrol level in the car");
    }

    @Override
    public void refill() {
        System.out.println("Refilling the petrol tank");
    }
    @Override
    public void design() {
        System.out.println("Designing a beautiful photo frame");
    }

    @Override
    public void assemble() {
        System.out.println("Assembling the components of the photo frame");
    }

    @Override
    public void display() {
        System.out.println("Displaying the photo frame with a picture");
    }
    @Override
    public void squeeze() {
        System.out.println("Squeezing ketchup from the bottle");
    }

    @Override
    public void dip() {
        System.out.println("Dipping fries into ketchup");
    }

    @Override
    public void store() {
        System.out.println("Storing the ketchup bottle in the fridge");
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
