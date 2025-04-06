package com.xworkz.inheritance1.SubClass;

import com.xworkz.inheritance1.SuperClass.Phone;

public class CameraPhone extends Phone {
    public CameraPhone() {
        System.out.println("CameraPhone is running in CameraPhone");
    }
@Override
public void call() {
    System.out.println("Call function is running in CameraPhone");
}
    public void camera() {
        System.out.println("Camera is running in CameraPhone");
    }
    public void battery() {
        System.out.println("Battery is running in CameraPhone");
    }
    public void brand() {
        System.out.println("Brand is running in CameraPhone");
    }
    public void price() {
        System.out.println("Price is running in CameraPhone");
    }
}
