package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Lipstick;

public class RedLipstick implements Lipstick {
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
}
