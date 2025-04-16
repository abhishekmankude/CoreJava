package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Glass;

public class DrinkingGlass implements Glass {
    @Override
    public void clean() {
        System.out.println("Cleaning the drinking glass");
    }

    @Override
    public void fill() {
        System.out.println("Filling the drinking glass with water");
    }

    @Override
    public void breakGlass() {
        System.out.println("Breaking the drinking glass");
    }
}
