package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Glass;
import com.xworkz.interfaceClass.internal.Shampoo;

public class Window implements Shampoo, Glass {
    @Override
    public void apply() {
        System.out.println("Applying shampoo to the hair");
    }

    @Override
    public void lather() {
        System.out.println("Lathering the shampoo into the hair");
    }

    @Override
    public void rinse() {
        System.out.println("Rinsing the shampoo out of the hair");
    }
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
