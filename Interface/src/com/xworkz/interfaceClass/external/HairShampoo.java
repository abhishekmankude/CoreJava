package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Shampoo;

public class HairShampoo implements Shampoo {
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
}
