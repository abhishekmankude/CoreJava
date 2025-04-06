package com.xworkz.inheritance1.SubClass;

import com.xworkz.inheritance1.SuperClass.Television;

public class LEDTV extends Television {
    public LEDTV() {
        System.out.println("LEDTV is running in LEDTV");
    }

@Override
public void screenSize() {
    System.out.println("Screen size function is running in LEDTV");
}
    public void resolution() {
        System.out.println("Resolution is running in LEDTV");
    }
    public void brand() {
        System.out.println("Brand is running in LEDTV");
    }
    public void price() {
        System.out.println("Price is running in LEDTV");
    }
}