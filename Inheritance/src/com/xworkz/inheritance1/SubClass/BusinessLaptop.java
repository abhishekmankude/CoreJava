package com.xworkz.inheritance1.SubClass;

import com.xworkz.inheritance1.SuperClass.Laptop;

public class BusinessLaptop extends Laptop {
    public BusinessLaptop() {
        System.out.println("BusinessLaptop is running in BusinessLaptop");
    }
    public void processor() {
        System.out.println("Processor is running in BusinessLaptop");
    }

    public void ram() {
        System.out.println("RAM is running in BusinessLaptop");
    }

    public void storage() {
        System.out.println("Storage is running in BusinessLaptop");
    }

    public void brand() {
        System.out.println("Brand is running in BusinessLaptop");
    }

    public void price() {
        System.out.println("Price is running in BusinessLaptop");
    }
}