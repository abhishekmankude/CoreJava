package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Burger;
import com.xworkz.interfaceClass.internal.Thief;

public class Comb implements Thief, Burger {
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
    @Override
    public void prepare() {
        System.out.println("Preparing a delicious veggie burger");
    }

    @Override
    public void serve() {
        System.out.println("Serving the veggie burger with fries");
    }

    @Override
    public void eat() {
        System.out.println("Eating the veggie burger with sauce");
    }
}
