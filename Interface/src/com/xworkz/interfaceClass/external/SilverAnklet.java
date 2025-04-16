package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Anklet;

public class SilverAnklet implements Anklet {
    @Override
    public void wear() {
        System.out.println("Wearing the silver anklet");
    }

    @Override
    public void makeSound() {
        System.out.println("Silver anklet is making a jingling sound");
    }

    @Override
    public void remove() {
        System.out.println("Removing the silver anklet");
    }
}
