package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Juice;

public class OrangeJuice implements Juice {
    @Override
    public void squeeze() {
        System.out.println("Squeezing fresh oranges for juice");
    }

    @Override
    public void mix() {
        System.out.println("Mixing the juice with a hint of sweetness");
    }

    @Override
    public void serve() {
        System.out.println("Serving the refreshing orange juice");
    }
}
