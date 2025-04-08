package com.xworkxz.inheritance2.subclass;

import com.xworkxz.inheritance2.superclass.Seaweed;

public class Nori extends Seaweed { public Nori() { System.out.println("No argument constructor in Nori"); }
@Override
public void color() { System.out.println("Color is running in Nori"); }
    public void kg() { System.out.println("kg is running in Nori"); }
    public void size() { System.out.println("size is running in Nori"); }
    public void origin() { System.out.println("origin is running in Nori"); }
    public void price() { System.out.println("price is running in Nori"); }
    public void country(){
        System.out.println("Country is Running");
    }}
