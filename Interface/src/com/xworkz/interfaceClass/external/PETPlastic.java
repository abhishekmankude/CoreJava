package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Plastic;

public class PETPlastic implements Plastic {
    @Override
    public void mold() {
        System.out.println("Molding the PET plastic into various shapes");
    }

    @Override
    public void recycle() {
        System.out.println("Recycling the PET plastic to create new products");
    }

    @Override
    public void dispose() {
        System.out.println("Properly disposing of PET plastic after use");
    }
}
