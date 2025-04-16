package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Rocket;

public class SpaceRocket implements Rocket {
    @Override
    public void launch() {
        System.out.println("Launching the space rocket");
    }

    @Override
    public void navigate() {
        System.out.println("Navigating the space rocket through orbit");
    }

    @Override
    public void land() {
        System.out.println("Landing the space rocket safely");
    }
}
