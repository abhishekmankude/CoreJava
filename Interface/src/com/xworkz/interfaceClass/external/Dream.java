package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Dentist;
import com.xworkz.interfaceClass.internal.Pilot;

public class Dream implements Dentist, Pilot {

    @Override
    public void cleanTeeth() {
        System.out.println("Dream dentist is cleaning teeth effectively.");
    }

    @Override
    public void fillCavity() {
        System.out.println("Dream dentist is filling a cavity with precision.");
    }

    @Override
    public void removeTooth() {
        System.out.println("Dream dentist is removing a tooth carefully.");
    }

    @Override
    public void takeOff() {
        System.out.println("Dream pilot is taking off smoothly.");
    }

    @Override
    public void fly() {
        System.out.println("Dream pilot is flying high in the sky.");
    }

    @Override
    public void land() {
        System.out.println("Dream pilot is landing the plane safely.");
    }
}
