package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Button;

public class PowerButton implements Button {
    @Override
    public void press() {
        System.out.println("Pressing the power button");
    }

    @Override
    public void release() {
        System.out.println("Releasing the power button");
    }

    @Override
    public void glow() {
        System.out.println("Power button is glowing");
    }
}
