package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Home;

public class FamilyHome implements Home {
    @Override
    public void clean() {
        System.out.println("Cleaning the house");
    }

    @Override
    public void cook() {
        System.out.println("Cooking a delicious meal");
    }

    @Override
    public void organize() {
        System.out.println("Organizing the home for a better living space");
    }
}
