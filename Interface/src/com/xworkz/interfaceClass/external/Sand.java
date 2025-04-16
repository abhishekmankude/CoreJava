package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.*;

public class Sand implements Chats, Noodles, Dentist, Pilot, Glass {
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

    public void cleanTeeth() {
        System.out.println("Cleaning teeth in a gentle way");
    }

    public void fillCavity() {
        System.out.println("Filling cavity with composite material");
    }

    public void removeTooth() {
        System.out.println("Removing tooth with care");
    }

    @Override
    public void takeOff() {
        System.out.println("Commercial pilot taking off from runway");
    }

    @Override
    public void fly() {
        System.out.println("Commercial pilot flying at 35,000 feet");
    }

    @Override
    public void land() {
        System.out.println("Commercial pilot landing safely at destination");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the drinking glass");
    }

    @Override
    public void fill() {
        System.out.println("Filling the drinking glass with water");
    }

    @Override
    public void breakGlass() {
        System.out.println("Breaking the drinking glass");
    }

}
