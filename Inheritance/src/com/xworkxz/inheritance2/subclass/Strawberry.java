package com.xworkxz.inheritance2.subclass;

import com.xworkxz.inheritance2.superclass.Berries;

public class Strawberry extends Berries {
    public Strawberry() { System.out.println("No argument constructor in Strawberry"); }

@Override
public void color() { System.out.println("Color is running in Strawberry"); }
    public void kg() { System.out.println("Kg is running in Strawberry"); }
    public void size() { System.out.println("Size is running in Strawberry"); }
    public void origin() { System.out.println("Origin is running in Strawberry"); }
    public void price() { System.out.println("Price is running in Strawberry"); }
}
