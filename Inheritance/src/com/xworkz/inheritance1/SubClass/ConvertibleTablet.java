package com.xworkz.inheritance1.SubClass;

import com.xworkz.inheritance1.SuperClass.Tablet;

public class ConvertibleTablet extends Tablet {
    public ConvertibleTablet() {
        System.out.println("ConvertibleTablet is running in ConvertibleTablet");
    }
@Override
public void screenSize() {
    System.out.println("Screen size function is running in ConvertibleTablet");
}
    public void storage() {
        System.out.println("Storage is running in ConvertibleTablet");
    }
    public void battery() {
        System.out.println("Battery is running in ConvertibleTablet");
    }
    public void brand() {
        System.out.println("Brand is running in ConvertibleTablet");
    }
    public void price() {
        System.out.println("Price is running in ConvertibleTablet");
    }
}