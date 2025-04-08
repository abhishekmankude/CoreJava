package com.xworkxz.inheritance2.subclass;

import com.xworkxz.inheritance2.superclass.Tubers;

public class Potato extends Tubers { public Potato() {
    System.out.println("No argument constructor in Potato");
}
@Override
public void color() { System.out.println("Color is running in Potato"); }
    public void kg() { System.out.println("kg is running in Potato"); }
    public void size() { System.out.println("size is running in Potato"); }
    public void origin() { System.out.println("origin is running in Potato"); }
    public void price() { System.out.println("price is running in Potato"); }
    public void country(){
        System.out.println("Country is Running");
    }}
