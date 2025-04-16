package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Rainbow;

public class ColorfulRainbow implements Rainbow {
    @Override
    public void appear() {
        System.out.println("The rainbow is appearing in the sky");
    }

    @Override
    public void shine() {
        System.out.println("The rainbow is shining with vibrant colors");
    }

    @Override
    public void fade() {
        System.out.println("The rainbow is slowly fading away");
    }
}
