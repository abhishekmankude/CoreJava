package com.xworkz.inheritance1.SubClass;

import com.xworkz.inheritance1.SuperClass.Shoe;

public class Adidas extends Shoe {
    public Adidas(){
        System.out.println("Running Adidas const in Adidas");
    }
@Override
public void sole()
{
    System.out.println("Sole is running in Adidas");
}

    public void lase()
    {
        System.out.println("Lase is running in Adidas");
    }

    public void color()
    {
        System.out.println("Color is running in Adidas");
    }

    public void brand()
    {
        System.out.println("Brand is running in Adidas");
    }

    public void price()
    {
        System.out.println("Price is running in Adidas");
    }}
