package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Color;

public class PaintColor implements Color {
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
