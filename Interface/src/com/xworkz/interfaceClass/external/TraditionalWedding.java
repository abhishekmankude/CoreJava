package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Wedding;

public class TraditionalWedding implements Wedding {
    @Override
    public void plan() {
        System.out.println("Planning the traditional wedding ceremony");
    }

    @Override
    public void celebrate() {
        System.out.println("Celebrating the wedding with family and friends");
    }

    @Override
    public void remember() {
        System.out.println("Remembering the joyous wedding moments");
    }
}
