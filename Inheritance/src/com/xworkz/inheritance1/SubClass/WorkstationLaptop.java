package com.xworkz.inheritance1.SubClass;

import com.xworkz.inheritance1.SuperClass.Laptop;

public class WorkstationLaptop extends Laptop {
    public WorkstationLaptop() {
        System.out.println("WorkstationLaptop is running in WorkstationLaptop");
    }

    public void processor() {
        System.out.println("Processor is running in WorkstationLaptop");
    }

    public void ram() {
        System.out.println("RAM is running in WorkstationLaptop");
    }

    public void storage() {
        System.out.println("Storage is running in WorkstationLaptop");
    }

    public void brand() {
        System.out.println("Brand is running in WorkstationLaptop");
    }

    public void price() {
        System.out.println("Price is running in WorkstationLaptop");
    }
}