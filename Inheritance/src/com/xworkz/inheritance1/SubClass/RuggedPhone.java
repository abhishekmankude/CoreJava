package com.xworkz.inheritance1.SubClass;

import com.xworkz.inheritance1.SuperClass.Phone;

public class RuggedPhone extends Phone {
    public RuggedPhone() {
        System.out.println("RuggedPhone is running in RuggedPhone");
    }
@Override
public void call() {
    System.out.println("Call function is running in RuggedPhone");
}
    public void camera() {
        System.out.println("Camera is running in RuggedPhone");
    }
    public void battery() {
        System.out.println("Battery is running in RuggedPhone");
    }
    public void brand() {
        System.out.println("Brand is running in RuggedPhone");
    }
    public void price() {
        System.out.println("Price is running in RuggedPhone");
    }}