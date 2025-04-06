package com.xworkz.inheritance1.SubClass;

import com.xworkz.inheritance1.SuperClass.Phone;

public class GamingPhone extends Phone {
    public GamingPhone() {
        System.out.println("GamingPhone is running in GamingPhone");
    }
    public void call() {
        System.out.println("Call function is running in GamingPhone");
    }
    public void camera() {
        System.out.println("Camera is running in GamingPhone");
    }
    public void battery() {
        System.out.println("Battery is running in GamingPhone");
    }
    public void brand() {
        System.out.println("Brand is running in GamingPhone");
    }
    public void price() {
        System.out.println("Price is running in GamingPhone");
    }}