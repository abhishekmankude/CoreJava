package com.xworkz.inheritance1.SubClass;

import com.xworkz.inheritance1.SuperClass.Laptop;

public class Ultrabook extends Laptop {
    public Ultrabook() {
        System.out.println("Ultrabook is running in Ultrabook");
    }
    public void processor() {
        System.out.println("Processor is running in Ultrabook");
    }

    public void ram() {
        System.out.println("RAM is running in Ultrabook");
    }

    public void storage() {
        System.out.println("Storage is running in Ultrabook");
    }

    public void brand() {
        System.out.println("Brand is running in Ultrabook");
    }

    public void price() {
        System.out.println("Price is running in Ultrabook");
    }
}