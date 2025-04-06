package com.xworkz.inheritance1.SubClass;

import com.xworkz.inheritance1.SuperClass.Tablet;

public class BudgetTablet extends Tablet {
    public BudgetTablet() {
        System.out.println("BudgetTablet is running in BudgetTablet");
    }
@Override
public void screenSize() {
    System.out.println("Screen size function is running in BudgetTablet");
}
    public void storage() {
        System.out.println("Storage is running in BudgetTablet");
    }
    public void battery() {
        System.out.println("Battery is running in BudgetTablet");
    }
    public void brand() {
        System.out.println("Brand is running in BudgetTablet");
    }
    public void price() {
        System.out.println("Price is running in BudgetTablet");
    }
}