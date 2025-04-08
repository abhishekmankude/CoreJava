package com.xworkxz.inheritance2.subclass;

import com.xworkxz.inheritance2.superclass.SportsEquipment;

public class Football extends SportsEquipment {
    public Football() { System.out.println("Football constructor"); }
@Override
public void use() { System.out.println("Football being used"); }
    public void store() { System.out.println("Football being stored"); }
    public void clean() { System.out.println("Football being cleaned"); }
    public void repair() { System.out.println("Football being repaired"); }
    public void upgrade() { System.out.println("Football being upgraded"); }
    public void country(){
        System.out.println("Country is Running");
    }}