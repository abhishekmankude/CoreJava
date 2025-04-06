package com.xworkz.inheritance1.SubClass;

import com.xworkz.inheritance1.SuperClass.Tablet;

public class WindowsTablet extends Tablet {
    public WindowsTablet() {
        System.out.println("WindowsTablet is running in WindowsTablet");
    }
@Override
public void screenSize() {
    System.out.println("Screen size function is running in WindowsTablet");
}
    public void storage() {
        System.out.println("Storage is running in WindowsTablet");
    }
    public void battery() {
        System.out.println("Battery is running in WindowsTablet");
    }
    public void brand() {
        System.out.println("Brand is running in WindowsTablet");
    }
    public void price() {
        System.out.println("Price is running in WindowsTablet");
    }
}