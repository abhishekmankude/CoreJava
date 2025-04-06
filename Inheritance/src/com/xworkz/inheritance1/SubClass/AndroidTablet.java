package com.xworkz.inheritance1.SubClass;

import com.xworkz.inheritance1.SuperClass.Tablet;

public class AndroidTablet extends Tablet {
    public AndroidTablet() {
        System.out.println("AndroidTablet is running in AndroidTablet");
    }
@Override

public void screenSize() {
    System.out.println("Screen size function is running in AndroidTablet");
}
    public void storage() {
        System.out.println("Storage is running in AndroidTablet");
    }
    public void battery() {
        System.out.println("Battery is running in AndroidTablet");
    }
    public void brand() {
        System.out.println("Brand is running in AndroidTablet");
    }
    public void price() {
        System.out.println("Price is running in AndroidTablet");
    }
}