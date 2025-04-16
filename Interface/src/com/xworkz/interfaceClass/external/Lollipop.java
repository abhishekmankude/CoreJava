package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Candy;

public class Lollipop implements Candy {
    @Override
    public void make() {
        System.out.println("Making colorful lollipops");
    }

    @Override
    public void wrap() {
        System.out.println("Wrapping the lollipops in colorful paper");
    }

    @Override
    public void distribute() {
        System.out.println("Distributing lollipops to kids");
    }
}
