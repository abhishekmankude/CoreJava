package com.xworkxz.inheritance2.subclass;

import com.xworkxz.inheritance2.superclass.Footwear;

public class Sneakers extends Footwear {
    public Sneakers() { System.out.println("Sneakers constructor"); }

@Override
public void wear() { System.out.println("Sneakers being worn"); }
    public void clean() { System.out.println("Sneakers being cleaned"); }
    public void polish() { System.out.println("Sneakers being polished"); }
    public void lace() { System.out.println("Sneakers being laced"); }
    public void store() { System.out.println("Sneakers being stored"); }
    public void country(){
        System.out.println("Country is Running");
    }}