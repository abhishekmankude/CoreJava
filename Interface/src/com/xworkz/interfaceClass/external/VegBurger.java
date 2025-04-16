package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Burger;

public class VegBurger implements Burger {
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
