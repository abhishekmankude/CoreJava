package com.xworkxz.inheritance2.subclass;

import com.xworkxz.inheritance2.superclass.Computer;

public class Laptop extends Computer {
    public Laptop() { System.out.println("Laptop constructor"); }

@Override
public void boot() { System.out.println("Laptop booting"); }
    public void shutdown() { System.out.println("Laptop shutting down"); }
    public void process() { System.out.println("Laptop processing"); }
    public void connect() { System.out.println("Laptop connecting"); }
    public void update() { System.out.println("Laptop updating"); }
}