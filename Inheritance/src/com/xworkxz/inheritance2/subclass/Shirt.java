package com.xworkxz.inheritance2.subclass;

import com.xworkxz.inheritance2.superclass.Clothing;

public class Shirt extends Clothing {
    public Shirt() { System.out.println("Shirt constructor"); }

@Override
public void wear() { System.out.println("Shirt being worn"); }
    public void wash() { System.out.println("Shirt being washed"); }
    public void dry() { System.out.println("Shirt drying"); }
    public void iron() { System.out.println("Shirt being ironed"); }
    public void fold() { System.out.println("Shirt being folded"); }
}