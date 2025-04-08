package com.xworkxz.inheritance2.subclass;

import com.xworkxz.inheritance2.superclass.Tool;

public class Hammer extends Tool {
    public Hammer() { System.out.println("Hammer constructor"); }

@Override
public void useTool() { System.out.println("Hammer being used"); }
    public void sharpen() { System.out.println("Hammer being sharpened"); }
    public void clean() { System.out.println("Hammer being cleaned"); }
    public void store() { System.out.println("Hammer being stored"); }
    public void repair() { System.out.println("Hammer being repaired"); }
    public void country(){
        System.out.println("Country is Running");
    }}