package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.*;

public class Pig implements Fan, Burger, Tree, Star, Candy {

    @Override
    public void turnOn() {
        System.out.println("Pig turns on the fan to cool the sty");
    }

    @Override
    public void adjustSpeed() {
        System.out.println("Pig adjusts fan speed with its snout");
    }

    @Override
    public void turnOff() {
        System.out.println("Pig turns off the fan before nap time");
    }

    @Override
    public void prepare() {
        System.out.println("Pig prepares a delicious veggie burger");
    }

    @Override
    public void serve() {
        System.out.println("Pig serves burgers with a muddy touch");
    }

    @Override
    public void eat() {
        System.out.println("Pig enjoys eating the burger noisily");
    }

    @Override
    public void grow() {
        System.out.println("Pig plants trees and watches them grow");
    }

    @Override
    public void provideShade() {
        System.out.println("Pig rests under the shade of a tree");
    }

    @Override
    public void shedLeaves() {
        System.out.println("Pig plays in the fallen leaves");
    }

    @Override
    public void shine() {
        System.out.println("Pig shines like a star in the piggy universe");
    }

    @Override
    public void twinkle() {
        System.out.println("Pig twinkles with joy after bath");
    }

    @Override
    public void disappear() {
        System.out.println("Pig disappears into the mud mysteriously");
    }

    @Override
    public void make() {
        System.out.println("Pig makes sweet candy in the barn");
    }

    @Override
    public void wrap() {
        System.out.println("Pig wraps candy in colorful paper");
    }

    @Override
    public void distribute() {
        System.out.println("Pig distributes candy to farm friends");
    }
}
