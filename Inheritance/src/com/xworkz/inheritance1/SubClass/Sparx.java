package com.xworkz.inheritance1.SubClass;

import com.xworkz.inheritance1.SuperClass.Shoe;

public class Sparx extends Shoe {

    public Sparx()
    {
        System.out.println("Running sparx in shoe");
    }
@Override
public void sole()
{
    System.out.println("Sole is running in Sparx");
}

    public void lase()
    {
        System.out.println("Lase is running in Sparx");
    }

    public void color()
    {
        System.out.println("Color is running in Sparx");
    }

    public void brand()
    {
        System.out.println("Brand is running in Sparx");
    }

    public void price()
    {
        System.out.println("Price is running in Sparx");
    }
}
