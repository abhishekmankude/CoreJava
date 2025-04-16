package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Sticker;

public class DecorativeSticker implements Sticker {
    @Override
    public void stick() {
        System.out.println("Sticking the decorative sticker");
    }

    @Override
    public void peel() {
        System.out.println("Peeling off the sticker");
    }

    @Override
    public void design() {
        System.out.println("Designing a new sticker");
    }
}
