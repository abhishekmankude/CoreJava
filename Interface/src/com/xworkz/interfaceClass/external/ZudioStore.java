package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Zudio;

public class ZudioStore implements Zudio {
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
}
