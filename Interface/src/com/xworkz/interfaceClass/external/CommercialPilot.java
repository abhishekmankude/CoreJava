package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Pilot;

public class CommercialPilot implements Pilot {
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
