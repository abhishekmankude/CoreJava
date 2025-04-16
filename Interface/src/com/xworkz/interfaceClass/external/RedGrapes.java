package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Grapes;

public class RedGrapes implements Grapes {
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
}
