package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Thief;

public class Robber implements Thief {
    @Override
    public void steal() {
        System.out.println("Robber is stealing valuable items");
    }

    @Override
    public void escape() {
        System.out.println("Robber is escaping from the crime scene");
    }

    @Override
    public void hide() {
        System.out.println("Robber is hiding in a safe place");
    }
}
