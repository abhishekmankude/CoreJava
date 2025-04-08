package com.xworkxz.inheritance2.subclass;

import com.xworkxz.inheritance2.superclass.LeafyGreens;

public class Spinach extends LeafyGreens {
    public Spinach() { System.out.println("No argument constructor in Spinach"); }
@Override
public void color() { System.out.println("Color is running in Spinach"); }
    public void kg() { System.out.println("Kg is running in Spinach"); }
    public void size() { System.out.println("Size is running in Spinach"); }
    public void origin() { System.out.println("Origin is running in Spinach"); }
    public void price() { System.out.println("Price is running in Spinach"); }
    public void country(){
        System.out.println("Country is Running");
    }}