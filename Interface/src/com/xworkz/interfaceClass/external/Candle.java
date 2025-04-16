package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Lens;
import com.xworkz.interfaceClass.internal.Water;

public class Candle implements Water, Lens {
    @Override
    public void flow() {
        System.out.println("Water is flowing in the river");
    }

    @Override
    public void purify() {
        System.out.println("Purifying the river water");
    }

    @Override
    public void store() {
        System.out.println("Storing water in a reservoir");
    }
    @Override
    public void focus() {
        System.out.println("Focusing the camera lens");
    }

    @Override
    public void zoom() {
        System.out.println("Zooming the camera lens");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the camera lens");
    }
}
