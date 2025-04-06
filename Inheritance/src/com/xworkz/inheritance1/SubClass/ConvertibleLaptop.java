package com.xworkz.inheritance1.SubClass;


import com.xworkz.inheritance1.SuperClass.Laptop;

public class ConvertibleLaptop extends Laptop {
    public ConvertibleLaptop() {
        System.out.println("ConvertibleLaptop is running in ConvertibleLaptop");
    }
    public void processor() {
        System.out.println("Processor is running in ConvertibleLaptop");
    }

    public void ram() {
        System.out.println("RAM is running in ConvertibleLaptop");
    }

    public void storage() {
        System.out.println("Storage is running in ConvertibleLaptop");
    }

    public void brand() {
        System.out.println("Brand is running in ConvertibleLaptop");
    }

    public void price() {
        System.out.println("Price is running in ConvertibleLaptop");
    }}