package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Jalebi;

public class SweetJalebi implements Jalebi {
    @Override
    public void fry() {
        System.out.println("Frying the jalebi in hot oil");
    }

    @Override
    public void soak() {
        System.out.println("Soaking the jalebi in sugar syrup");
    }

    @Override
    public void serve() {
        System.out.println("Serving the hot and sweet jalebi");
    }
}
