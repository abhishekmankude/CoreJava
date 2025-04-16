package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Zoo;

public class WildlifeZoo implements Zoo {
    @Override
    public void displayAnimals() {
        System.out.println("Displaying various animals in the zoo");
    }

    @Override
    public void organizeTours() {
        System.out.println("Organizing guided tours for zoo visitors");
    }

    @Override
    public void conserveSpecies() {
        System.out.println("Conserving endangered species in the zoo");
    }
}
