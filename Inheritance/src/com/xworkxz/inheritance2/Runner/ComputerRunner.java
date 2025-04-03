package com.xworkxz.inheritance2.Runner;

import com.xworkxz.inheritance2.subclass.Laptop;
import com.xworkxz.inheritance2.superclass.Computer;

public class ComputerRunner {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.boot();
        computer.shutdown();
        computer.process();
        computer.connect();
        computer.update();

        Computer computer1 = new Laptop();
        computer1.boot();
        computer1.shutdown();
        computer1.process();
        computer1.connect();
        computer1.update();

        Laptop laptop = new Laptop();
        laptop.boot();
        laptop.shutdown();
        laptop.process();
        laptop.connect();
        laptop.update();
    }
}