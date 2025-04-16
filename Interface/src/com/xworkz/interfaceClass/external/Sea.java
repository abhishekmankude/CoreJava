package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.*;

public class Sea implements Glass, Shampoo, Bubble, Dance, Mirror {
    @Override
    public void clean() {
        System.out.println("Cleaning the drinking glass");
    }

    @Override
    public void fill() {
        System.out.println("Filling the drinking glass with water");
    }

    @Override
    public void breakGlass() {
        System.out.println("Breaking the drinking glass");
    }
    @Override
    public void apply() {
        System.out.println("Applying shampoo to the hair");
    }

    @Override
    public void lather() {
        System.out.println("Lathering the shampoo into the hair");
    }

    @Override
    public void rinse() {
        System.out.println("Rinsing the shampoo out of the hair");
    }
    @Override
    public void create() {
        System.out.println("Creating a soap bubble with a bubble wand");
    }

    @Override
    public void pop() {
        System.out.println("Popping the soap bubble");
    }

    @Override
    public void floatInAir() {
        System.out.println("Watching the soap bubble float in the air");
    }
    @Override
    public void perform() {
        System.out.println("Performing a ballet dance on stage");
    }

    @Override
    public void practice() {
        System.out.println("Practicing ballet dance moves");
    }

    @Override
    public void choreograph() {
        System.out.println("Choreographing a new ballet performance");
    }
    @Override
    public void reflect() {
        System.out.println("The mirror reflects the image");
    }

    @Override
    public void frame() {
        System.out.println("Framing the mirror with an elegant border");
    }
}
