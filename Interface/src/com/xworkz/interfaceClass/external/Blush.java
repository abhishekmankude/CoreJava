package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Towel;
import com.xworkz.interfaceClass.internal.Oreo;
import com.xworkz.interfaceClass.internal.Tower;
import com.xworkz.interfaceClass.internal.Petrol;
import com.xworkz.interfaceClass.internal.Wheel;

public class Blush implements Towel, Oreo, Tower, Petrol, Wheel {

    @Override
    public void dry() {
        System.out.println("Drying the body with the towel after a shower");
    }

    @Override
    public void fold() {
        System.out.println("Folding the towel after use");
    }

    @Override
    public void wash() {
        System.out.println("Washing the towel for reuse");
    }

    @Override
    public void open() {
        System.out.println("Opening the Oreo packet");
    }

    @Override
    public void eat() {
        System.out.println("Eating the delicious Oreo cookie");
    }

    @Override
    public void share() {
        System.out.println("Sharing the Oreo with friends");
    }

    @Override
    public void build() {
        System.out.println("Building the tower");
    }

    @Override
    public void lightUp() {
        System.out.println("Lighting up the tower at night");
    }

    @Override
    public void maintain() {
        System.out.println("Maintaining the tower for preservation");
    }

    @Override
    public void fuelEngine() {
        System.out.println("Filling petrol into the car engine");
    }

    @Override
    public void checkLevel() {
        System.out.println("Checking the petrol level in the car");
    }

    @Override
    public void refill() {
        System.out.println("Refilling the petrol tank");
    }

    @Override
    public void rotate() {
        System.out.println("Rotating the car wheel");
    }

    @Override
    public void inflate() {
        System.out.println("Inflating the car wheel");
    }

    @Override
    public void repair() {
        System.out.println("Repairing the car wheel");
    }
}
