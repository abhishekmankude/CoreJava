package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Ghee;

public class ClarifiedGhee implements Ghee {
    @Override
    public void melt() {
        System.out.println("Melting the clarified ghee");
    }

    @Override
    public void useInCooking() {
        System.out.println("Using ghee in cooking for rich flavor");
    }

    @Override
    public void store() {
        System.out.println("Storing the ghee in a cool place");
    }
}

