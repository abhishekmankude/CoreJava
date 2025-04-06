package com.xworkz.inheritance1.SubClass;

import com.xworkz.inheritance1.SuperClass.Shoe;

public class Nike extends Shoe {

    public Nike()
    {
        System.out.println("nike const is running in Nike ");
    }

@Override
public void sole()
{
    System.out.println("Sole is running in Nike");
}

    public void lase()
    {
        System.out.println("Lase is running in Nike");
    }

    public void color()
    {
        System.out.println("Color is running in Nike");
    }

    public void brand()
    {
        System.out.println("Brand is running in Nike");
    }

    public void price()
    {
        System.out.println("Price is running in Nike");
    }
}
