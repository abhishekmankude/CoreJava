package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Lilly;

public class LillyFlower implements Lilly {
    @Override
    public void bloom() {
        System.out.println("The Lilly is blooming");
    }

    @Override
    public void fragrance() {
        System.out.println("The Lilly has a sweet fragrance");
    }

    @Override
    public void wilt() {
        System.out.println("The Lilly is wilting");
    }
}
