package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Barbie;

public class DollBarbie implements Barbie {
    @Override
    public void dressUp() {
        System.out.println("Dressing up the Barbie doll");
    }

    @Override
    public void play() {
        System.out.println("Playing with the Barbie doll");
    }

    @Override
    public void collect() {
        System.out.println("Collecting different Barbie dolls");
    }
}
