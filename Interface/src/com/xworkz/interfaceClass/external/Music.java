package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.*;

public class Music implements Dance, Mirror, Bed, Zoo, Color {
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
    public void clean() {
        System.out.println("Cleaning the mirror for clarity");
    }

    @Override
    public void frame() {
        System.out.println("Framing the mirror with an elegant border");
    }
    @Override
    public void layDown() {
        System.out.println("Laying down on the king-size bed");
    }

    @Override
    public void make() {
        System.out.println("Making the king-size bed");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping on the king-size bed");
    }
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
    @Override
    public void mix() {
        System.out.println("Mixing different paints to create a new color");
    }

    @Override
    public void apply() {
        System.out.println("Applying the paint color to the surface");
    }

    @Override
    public void fade() {
        System.out.println("The paint color starts to fade over time");
    }
}
