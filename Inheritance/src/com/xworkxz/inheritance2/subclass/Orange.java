package com.xworkxz.inheritance2.subclass;

import com.xworkxz.inheritance2.superclass.CitrusFruits;

public class Orange extends CitrusFruits { public Orange() { System.out.println("No argument constructor in Orange"); }
@Override
public void color() { System.out.println("Color is running in Orange Fruits"); }
    public void kg() { System.out.println("kg is running in Orange Fruits"); }
    public void size() { System.out.println("size is running in Orange Fruits"); }
    public void origin() { System.out.println("origin is running in Orange Fruits"); }
    public void price() { System.out.println("price is running in Orange Fruits"); }
    public void country(){
        System.out.println("Country is Running");
    }
}
