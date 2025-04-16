package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Rice;

public class BasmatiRice implements Rice {
    @Override
    public void cook() {
        System.out.println("Cooking the basmati rice with a fragrant aroma");
    }

    @Override
    public void store() {
        System.out.println("Storing the basmati rice in a cool, dry place");
    }

    @Override
    public void harvest() {
        System.out.println("Harvesting the basmati rice from the field");
    }
}
