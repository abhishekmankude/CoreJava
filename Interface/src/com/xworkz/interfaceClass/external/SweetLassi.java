package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Lassi;

public class SweetLassi implements Lassi {
    @Override
    public void mix() {
        System.out.println("Mixing yogurt, water, and sugar to make sweet lassi");
    }

    @Override
    public void serve() {
        System.out.println("Serving the refreshing sweet lassi");
    }

    @Override
    public void drink() {
        System.out.println("Drinking the sweet and chilled lassi");
    }
}
