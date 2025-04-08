package com.xworkxz.inheritance2.subclass;

import com.xworkxz.inheritance2.superclass.FrozenFood;

public class FrozenPizza extends FrozenFood {
    public FrozenPizza() {
        System.out.println("No argument constructor in FrozenPizza");
    }
    @Override
    public void category() {
        System.out.println("Category is running in FrozenPizza");
    }
    public void storageTemp() {
        System.out.println("Storage temperature is running in FrozenPizza");
    }
    public void expiryDate() {
        System.out.println("Expiry date is running in FrozenPizza");
    }
    public void origin() {
        System.out.println("Origin is running in FrozenPizza");
    }
    public void price() {
        System.out.println("Price is running in FrozenPizza");
    }
    public void country(){
        System.out.println("Country is Running");
    }
}
