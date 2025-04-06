package com.xworkz.inheritance1.SubClass;


import com.xworkz.inheritance1.SuperClass.Television;

public class SmartTV extends Television {
    public SmartTV() {
        System.out.println("SmartTV is running in SmartTV");
    }
    public void screenSize() {
        System.out.println("Screen size function is running in SmartTV");
    }
    public void resolution() {
        System.out.println("Resolution is running in SmartTV");
    }
    public void brand() {
        System.out.println("Brand is running in SmartTV");
    }
    public void price() {
        System.out.println("Price is running in SmartTV");
    }
}
