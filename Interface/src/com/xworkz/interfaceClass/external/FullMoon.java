package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Moon;

public class FullMoon implements Moon {
    @Override
    public void rise() {
        System.out.println("The full moon is rising in the sky");
    }

    @Override
    public void shine() {
        System.out.println("The full moon is shining brightly");
    }

    @Override
    public void set() {
        System.out.println("The full moon is setting after a long night");
    }
}
