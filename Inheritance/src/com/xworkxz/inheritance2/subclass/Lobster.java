package com.xworkxz.inheritance2.subclass;


import com.xworkxz.inheritance2.superclass.Shellfish;

public class Lobster extends Shellfish {
    public Lobster() { System.out.println("No argument constructor in Lobster"); }

@Override
public void color() { System.out.println("Color is running in Lobster"); }
    public void kg() { System.out.println("Kg is running in Lobster"); }
    public void size() { System.out.println("Size is running in Lobster"); }
    public void origin() { System.out.println("Origin is running in Lobster"); }
    public void price() { System.out.println("Price is running in Lobster"); }
    public void country(){
        System.out.println("Country is Running");
    }}
