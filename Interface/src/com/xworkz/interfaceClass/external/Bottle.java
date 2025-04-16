package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Barber;
import com.xworkz.interfaceClass.internal.Grapes;

public class Bottle implements Grapes, Barber {
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
    public void cutHair() {
        System.out.println("Cutting hair with precision");
    }

    @Override
    public void shave() {
        System.out.println("Shaving the beard smoothly");
    }

    @Override
    public void trimBeard() {
        System.out.println("Trimming the beard to perfection");
    }
}
