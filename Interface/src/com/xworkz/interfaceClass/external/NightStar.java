package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Star;

public class NightStar implements Star {
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
