package com.xworkz.inheritance1.SubClass;

import com.xworkz.inheritance1.SuperClass.Television;

public class OLEDTV extends Television {
    public OLEDTV() {
        System.out.println("OLEDTV is running in OLEDTV");
    }

@Override
public void screenSize() {
    System.out.println("Screen size function is running in OLEDTV");
}
    public void resolution() {
        System.out.println("Resolution is running in OLEDTV");
    }
    public void brand() {
        System.out.println("Brand is running in OLEDTV");
    }
    public void price() {
        System.out.println("Price is running in OLEDTV");
    }
}