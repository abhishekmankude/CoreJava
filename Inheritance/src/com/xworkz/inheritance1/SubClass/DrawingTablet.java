package com.xworkz.inheritance1.SubClass;

import com.xworkz.inheritance1.SuperClass.Tablet;

public class DrawingTablet extends Tablet {
    public DrawingTablet() {
        System.out.println("DrawingTablet is running in DrawingTablet");
    }
@Override
public void screenSize() {
    System.out.println("Screen size function is running in DrawingTablet");
}
    public void storage() {
        System.out.println("Storage is running in DrawingTablet");
    }
    public void battery() {
        System.out.println("Battery is running in DrawingTablet");
    }
    public void brand() {
        System.out.println("Brand is running in DrawingTablet");
    }
    public void price() {
        System.out.println("Price is running in DrawingTablet");
    }}