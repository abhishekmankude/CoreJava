package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Barber;
import com.xworkz.interfaceClass.internal.Mall;
import com.xworkz.interfaceClass.internal.Fan;
import com.xworkz.interfaceClass.internal.Star;
import com.xworkz.interfaceClass.internal.Oreo;

public class Cover implements Barber, Mall, Fan, Star, Oreo {

    @Override
    public void cutHair() {
        System.out.println("Barber cutting hair");
    }

    @Override
    public void shave() {
        System.out.println("Barber shaving customer");
    }

    @Override
    public void trimBeard() {
        System.out.println("Barber trimming beard");
    }

    @Override
    public void open() {
        System.out.println("Mall or Oreo opening");
    }

    @Override
    public void close() {
        System.out.println("Mall is closing");
    }

    @Override
    public void offerDeals() {
        System.out.println("Mall offering deals");
    }

    @Override
    public void turnOn() {
        System.out.println("Fan is turned on");
    }

    @Override
    public void adjustSpeed() {
        System.out.println("Adjusting fan speed");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan is turned off");
    }

    @Override
    public void shine() {
        System.out.println("Star is shining");
    }

    @Override
    public void twinkle() {
        System.out.println("Star is twinkling");
    }

    @Override
    public void disappear() {
        System.out.println("Star disappears");
    }

    @Override
    public void eat() {
        System.out.println("Eating Oreo");
    }

    @Override
    public void share() {
        System.out.println("Sharing Oreo");
    }
}
