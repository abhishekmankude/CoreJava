package com.xworkz.inheritance1.SubClass;

import com.xworkz.inheritance1.SuperClass.Phone;

public  class Smartphone extends Phone {
    public Smartphone() {
        System.out.println("Smartphone is running in Smartphone");
    }
    public void call() {
        System.out.println("Call function is running in Smartphone");
    }
    public void camera() {
        System.out.println("Camera is running in Smartphone");
    }
    public void battery() {
        System.out.println("Battery is running in Smartphone");
    }
    public void brand() {
        System.out.println("Brand is running in Smartphone");
    }
    public void price() {
        System.out.println("Price is running in Smartphone");
    }}

