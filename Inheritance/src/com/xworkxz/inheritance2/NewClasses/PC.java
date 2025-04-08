package com.xworkxz.inheritance2.NewClasses;

import com.xworkxz.inheritance2.subclass.Laptop;
import com.xworkxz.inheritance2.superclass.Computer;

public class PC {
public void performance(Computer computer) {
            computer.boot();
            computer.process();
            computer.connect();
            computer.update();
            computer.shutdown();

            if(computer instanceof Laptop) {
                Laptop laptop = (Laptop)computer;
                laptop.country();
            }
        }
    }
