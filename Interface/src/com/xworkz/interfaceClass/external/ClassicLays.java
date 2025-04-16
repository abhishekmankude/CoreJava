package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Lays;

public class ClassicLays implements Lays {
    @Override
    public void open() {
        System.out.println("Opening the Lays packet");
    }

    @Override
    public void eat() {
        System.out.println("Eating Lays chips");
    }

    @Override
    public void share() {
        System.out.println("Sharing Lays with friends");
    }
}
