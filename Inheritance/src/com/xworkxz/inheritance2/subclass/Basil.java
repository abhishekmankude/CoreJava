package com.xworkxz.inheritance2.subclass;

import com.xworkxz.inheritance2.superclass.Herbs;

public class Basil extends Herbs {
    public Basil() {
        System.out.println("No argument constructor in Basil");
    }
    @Override
    public void type() {
        System.out.println("Type is running in Basil");
    }
    public void aroma() {
        System.out.println("Aroma is running in Basil");
    }
    public void medicinalValue() {
        System.out.println("Medicinal value is running in Basil");
    }
    public void origin() {
        System.out.println("Origin is running in Basil");
    }
    public void price() {
        System.out.println("Price is running in Basil");
    }
    public void country(){
        System.out.println("Country is Running");
    }
}
