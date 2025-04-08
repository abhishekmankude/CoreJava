package com.xworkxz.inheritance2.subclass;

import com.xworkxz.inheritance2.superclass.Seafood;

public class Salmon extends Seafood {
    public Salmon() {
        System.out.println("No argument constructor in Salmon");
    }
    @Override
    public void species() {
        System.out.println("Species is running in Salmon");
    }
    public void weight() {
        System.out.println("Weight is running in Salmon");
    }
    public void freshness() {
        System.out.println("Freshness is running in Salmon");
    }
    public void origin() {
        System.out.println("Origin is running in Salmon");
    }
    public void price() {
        System.out.println("Price is running in Salmon");
    }

    public void country(){
        System.out.println("Country is Running");
    }
}
