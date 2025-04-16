package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Lipstick;
import com.xworkz.interfaceClass.internal.Star;

public class Maggie implements Lipstick, Star {
    @Override
    public void apply() {
        System.out.println("Applying red lipstick");
    }

    @Override
    public void remove() {
        System.out.println("Removing the lipstick");
    }

    @Override
    public void checkColor() {
        System.out.println("Checking the lipstick color");
    }
    @Override
    public void shine() {
        System.out.println("The star is shining in the night sky");
    }

    @Override
    public void twinkle() {
        System.out.println("The star is twinkling in the sky");
    }

    @Override
    public void disappear() {
        System.out.println("The star has disappeared behind the clouds");
    }
}
