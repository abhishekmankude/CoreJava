package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.TShirt;

public class CottonTShirt implements TShirt {
    @Override
    public void wear() {
        System.out.println("Wearing the cotton T-shirt");
    }

    @Override
    public void wash() {
        System.out.println("Washing the cotton T-shirt");
    }

    @Override
    public void fold() {
        System.out.println("Folding the cotton T-shirt");
    }
}
