package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Dance;

public class BalletDance implements Dance {
    @Override
    public void perform() {
        System.out.println("Performing a ballet dance on stage");
    }

    @Override
    public void practice() {
        System.out.println("Practicing ballet dance moves");
    }

    @Override
    public void choreograph() {
        System.out.println("Choreographing a new ballet performance");
    }
}
