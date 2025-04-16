package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Ice;

public class IceCube implements Ice {
    @Override
    public void freeze() {
        System.out.println("Freezing water into ice cubes");
    }

    @Override
    public void store() {
        System.out.println("Storing ice cubes in the freezer");
    }

    @Override
    public void melt() {
        System.out.println("Melting the ice cubes");
    }
}
