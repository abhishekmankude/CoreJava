package com.xworkxz.inheritance2.subclass;

import com.xworkxz.inheritance2.superclass.Furniture;

public class Chair extends Furniture {
    public Chair() { System.out.println("Chair constructor"); }
@Override

public void assemble() { System.out.println("Chair assembling"); }
    public void disassemble() { System.out.println("Chair disassembling"); }
    public void clean() { System.out.println("Chair cleaning"); }
    public void move() { System.out.println("Chair moving"); }
    public void polish() { System.out.println("Chair polishing"); }
}