package com.xworkz.inheritance1.SubClass;

import com.xworkz.inheritance1.SuperClass.Phone;

public class FoldablePhone extends Phone {
    public FoldablePhone() {
        System.out.println("FoldablePhone is running in FoldablePhone");
    }
@Override
public void call() {
    System.out.println("Call function is running in FoldablePhone");
}
    public void camera() {
        System.out.println("Camera is running in FoldablePhone");
    }
    public void battery() {
        System.out.println("Battery is running in FoldablePhone");
    }
    public void brand() {
        System.out.println("Brand is running in FoldablePhone");
    }
    public void price() {
        System.out.println("Price is running in FoldablePhone");
    }
}
