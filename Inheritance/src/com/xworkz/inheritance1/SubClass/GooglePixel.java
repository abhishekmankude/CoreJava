package com.xworkz.inheritance1.SubClass;

import com.xworkz.inheritance1.SuperClass.SmartPhone;

public class GooglePixel extends SmartPhone {
    public GooglePixel() {
        System.out.println("GooglePixel constructor is running");
    }
@Override
public void display()
{
    System.out.println("Display is running in GooglePixel");
}

    public void camera()
    {
        System.out.println("Camera is running in GooglePixel");
    }

    public void battery()
    {
        System.out.println("Battery is running in GooglePixel");
    }

    public void brand()
    {
        System.out.println("Brand is running in GooglePixel");
    }

    public void price()
    {
        System.out.println("Price is running in GooglePixel");
    }
}