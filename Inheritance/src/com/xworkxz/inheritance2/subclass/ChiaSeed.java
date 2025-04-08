package com.xworkxz.inheritance2.subclass;

import com.xworkxz.inheritance2.superclass.EdibleSeeds;

public class ChiaSeed extends EdibleSeeds { public ChiaSeed() { System.out.println("No argument constructor in ChiaSeed"); }

    @Override
    public void color() { System.out.println("Color is running in ChiaSeed"); }
    public void kg() { System.out.println("kg is running in ChiaSeed"); }
    public void size() { System.out.println("size is running in ChiaSeed"); }
    public void origin() { System.out.println("origin is running in ChiaSeed"); }
    public void price() { System.out.println("price is running in ChiaSeed"); }
    public void country(){
        System.out.println("Country is Running");
    }}


