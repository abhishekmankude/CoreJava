package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Clip;
import com.xworkz.interfaceClass.internal.Bangle;
import com.xworkz.interfaceClass.internal.Lipstick;
import com.xworkz.interfaceClass.internal.Lassi;
import com.xworkz.interfaceClass.internal.Juice;

public class Pillow implements Clip, Bangle, Lipstick, Lassi, Juice {

    @Override
    public void attach() {
        System.out.println("Clip attached");
    }

    @Override
    public void secure() {
        System.out.println("Clip secured");
    }

    @Override
    public void remove() {
        System.out.println("Removing from Clip, Bangle, and Lipstick");
    }

    @Override
    public void wear() {
        System.out.println("Wearing bangle");
    }

    @Override
    public void shine() {
        System.out.println("Shining bangle");
    }

    @Override
    public void apply() {
        System.out.println("Applying lipstick");
    }

    @Override
    public void checkColor() {
        System.out.println("Checking lipstick color");
    }

    @Override
    public void mix() {
        System.out.println("Mixing Lassi and Juice");
    }

    @Override
    public void serve() {
        System.out.println("Serving Lassi and Juice");
    }

    @Override
    public void drink() {
        System.out.println("Drinking Lassi");
    }

    @Override
    public void squeeze() {
        System.out.println("Squeezing Juice");
    }
}
