package com.xworkz.inheritance1.SubClass;

import com.xworkz.inheritance1.SuperClass.Phone;

public class FeaturePhone extends Phone {
    public FeaturePhone() {
        System.out.println("FeaturePhone is running in FeaturePhone");
    }
@Override
public void call() {
    System.out.println("Call function is running in FeaturePhone");
}
    public void camera() {
        System.out.println("Camera is running in FeaturePhone");
    }
    public void battery() {
        System.out.println("Battery is running in FeaturePhone");
    }
    public void brand() {
        System.out.println("Brand is running in FeaturePhone");
    }
    public void price() {
        System.out.println("Price is running in FeaturePhone");
    }
}