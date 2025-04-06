package com.xworkz.inheritance1.SubClass;

import com.xworkz.inheritance1.SuperClass.Laptop;

public class BudgetLaptop extends Laptop {
    public BudgetLaptop() {
        System.out.println("BudgetLaptop is running in BudgetLaptop");
    }
@Override
public void processor() {
    System.out.println("Processor is running in BudgetLaptop");
}

    public void ram() {
        System.out.println("RAM is running in BudgetLaptop");
    }

    public void storage() {
        System.out.println("Storage is running in BudgetLaptop");
    }

    public void brand() {
        System.out.println("Brand is running in BudgetLaptop");
    }

    public void price() {
        System.out.println("Price is running in BudgetLaptop");
    }
}