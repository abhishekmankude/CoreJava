package com.xworkz.inheritance1.SubClass;

import com.xworkz.inheritance1.SuperClass.Tablet;

public class KidsTablet extends Tablet {
    public KidsTablet() {
        System.out.println("KidsTablet is running in KidsTablet");
    }
@Override
public void screenSize() {
    System.out.println("Screen size function is running in KidsTablet");
}
    public void storage() {
        System.out.println("Storage is running in KidsTablet");
    }
    public void battery() {
        System.out.println("Battery is running in KidsTablet");
    }
    public void brand() {
        System.out.println("Brand is running in KidsTablet");
    }
    public void price() {
        System.out.println("Price is running in KidsTablet");
    }}