package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Oreo;

public class ChocolateOreo implements Oreo {
    @Override
    public void open() {
        System.out.println("Opening the Oreo packet");
    }

    @Override
    public void eat() {
        System.out.println("Eating the delicious Oreo cookie");
    }

    @Override
    public void share() {
        System.out.println("Sharing the Oreo with friends");
    }
}
