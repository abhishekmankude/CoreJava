package com.xworkxz.inheritance2.subclass;

import com.xworkxz.inheritance2.superclass.GameMeat;

public class Venison extends GameMeat { public Venison() { System.out.println("No argument constructor in Venison"); }
@Override
public void color() { System.out.println("Color is running in Venison"); }
    public void kg() { System.out.println("kg is running in Venison"); }
    public void size() { System.out.println("size is running in Venison"); }
    public void origin() { System.out.println("origin is running in Venison"); }
    public void price() { System.out.println("price is running in Venison"); }
    public void country(){
        System.out.println("Country is Running");
    }}

