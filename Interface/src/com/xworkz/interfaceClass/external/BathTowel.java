package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Towel;

public class BathTowel implements Towel {
    @Override
    public void dry() {
        System.out.println("The bath towel is drying the body after a shower");
    }

    @Override
    public void fold() {
        System.out.println("Folding the bath towel after use");
    }

    @Override
    public void wash() {
        System.out.println("Washing the bath towel for reuse");
    }
}
