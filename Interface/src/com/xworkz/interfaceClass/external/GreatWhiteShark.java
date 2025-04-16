package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Shark;

public class GreatWhiteShark implements Shark {
    @Override
    public void swim() {
        System.out.println("The great white shark is swimming through the ocean");
    }

    @Override
    public void hunt() {
        System.out.println("The great white shark is hunting for prey");
    }

    @Override
    public void rest() {
        System.out.println("The great white shark is resting in deep waters");
    }
}
