package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Shark;
import com.xworkz.interfaceClass.internal.Home;

public class Cloud implements Shark, Home {

    @Override
    public void swim() {
        System.out.println("Cloud shark is gliding through digital waves.");
    }

    @Override
    public void hunt() {
        System.out.println("Cloud shark is hunting data packets.");
    }

    @Override
    public void rest() {
        System.out.println("Cloud shark is in standby mode.");
    }

    @Override
    public void clean() {
        System.out.println("Cloud home is running system cleanup.");
    }

    @Override
    public void cook() {
        System.out.println("Cloud home is preparing virtual meals.");
    }

    @Override
    public void organize() {
        System.out.println("Cloud home is organizing digital shelves.");
    }
}
