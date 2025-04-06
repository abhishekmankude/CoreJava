package com.xworkz.inheritance1.SubClass;

import com.xworkz.inheritance1.SuperClass.Television;

public class PlasmaTV extends Television {
    public PlasmaTV() {
        System.out.println("PlasmaTV is running in PlasmaTV");
    }
    public void screenSize() {
        System.out.println("Screen size function is running in PlasmaTV");
    }
    public void resolution() {
        System.out.println("Resolution is running in PlasmaTV");
    }
    public void brand() {
        System.out.println("Brand is running in PlasmaTV");
    }
    public void price() {
        System.out.println("Price is running in PlasmaTV");
    }
}
