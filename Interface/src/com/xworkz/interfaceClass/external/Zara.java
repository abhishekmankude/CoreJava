package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Dentist;
import com.xworkz.interfaceClass.internal.Pilot;

public class Zara implements Dentist, Pilot {
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

}
