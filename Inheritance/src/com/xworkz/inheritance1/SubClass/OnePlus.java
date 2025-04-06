package com.xworkz.inheritance1.SubClass;


import com.xworkz.inheritance1.SuperClass.SmartPhone;

public class OnePlus extends SmartPhone {
    public OnePlus() {
        System.out.println("OnePlus constructor is running");
    }
@Override
public void display()
{
    System.out.println("Display is running in OnePlus");
}

    public void camera()
    {
        System.out.println("Camera is running in OnePlus");
    }

    public void battery()
    {
        System.out.println("Battery is running in OnePlus");
    }

    public void brand()
    {
        System.out.println("Brand is running in OnePlus");
    }

    public void price()
    {
        System.out.println("Price is running in OnePlus");
    }
}