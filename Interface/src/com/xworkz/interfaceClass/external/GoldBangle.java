package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Bangle;

public class GoldBangle implements Bangle {
    @Override
    public void wear() {
        System.out.println("Wearing the gold bangle");
    }

    @Override
    public void shine() {
        System.out.println("The gold bangle is shining");
    }

    @Override
    public void remove() {
        System.out.println("Removing the gold bangle");
    }
}
