package com.xworkz.inheritance1.SubClass;

import com.xworkz.inheritance1.SuperClass.SmartPhone;

public class Samsung extends SmartPhone {

    public Samsung() {
        System.out.println("Samsung constructor is running");
    }
@Override
public void display()
{
    System.out.println("Display is running in Samsung");
}

    public void camera()
    {
        System.out.println("Camera is running in Samsung");
    }

    public void battery()
    {
        System.out.println("Battery is running in Samsung");
    }

    public void brand()
    {
        System.out.println("Brand is running in Samsung");
    }

    public void price()
    {
        System.out.println("Price is running in Samsung");
    }
}
