package com.xworkxz.inheritance2.subclass;

import com.xworkxz.inheritance2.superclass.Oilseeds;

public class SunflowerSeed extends Oilseeds { public SunflowerSeed() { System.out.println("No argument constructor in SunflowerSeed"); }
@Override
public void color() { System.out.println("Color is running in SunflowerSeed"); }
    public void kg() { System.out.println("kg is running in SunflowerSeed"); }
    public void size() { System.out.println("size is running in SunflowerSeed"); }
    public void origin() { System.out.println("origin is running in SunflowerSeed"); }
    public void price() { System.out.println("price is running in SunflowerSeed"); }
    public void country(){
        System.out.println("Country is Running");
    }}
