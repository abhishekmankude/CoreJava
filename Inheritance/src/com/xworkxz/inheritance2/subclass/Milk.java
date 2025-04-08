package com.xworkxz.inheritance2.subclass;

import com.xworkxz.inheritance2.superclass.Dairy;

public class Milk extends Dairy {
    public Milk() {
        System.out.println("No argument constructor in Milk");
    }
    @Override
    public void fatContent() {
        System.out.println("Fat content is running in Milk");
    }
    public void liters() {
        System.out.println("Liters is running in Milk");
    }
    public void expiryDate() {
        System.out.println("Expiry date is running in Milk");
    }
    public void brand() {
        System.out.println("Brand is running in Milk");
    }
    public void price() {
        System.out.println("Price is running in Milk");
    }public void country(){
        System.out.println("Country is Running");
    }
}