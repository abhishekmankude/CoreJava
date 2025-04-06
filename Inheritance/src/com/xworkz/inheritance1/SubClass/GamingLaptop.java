package com.xworkz.inheritance1.SubClass;


import com.xworkz.inheritance1.SuperClass.Laptop;

public class GamingLaptop extends Laptop {
    public GamingLaptop() {
        System.out.println("GamingLaptop is running in GamingLaptop");
    }
    public void processor() {
        System.out.println("Processor is running in GamingLaptop");
    }

    public void ram() {
        System.out.println("RAM is running in GamingLaptop");
    }

    public void storage() {
        System.out.println("Storage is running in GamingLaptop");
    }

    public void brand() {
        System.out.println("Brand is running in GamingLaptop");
    }

    public void price() {
        System.out.println("Price is running in GamingLaptop");
    }
}
