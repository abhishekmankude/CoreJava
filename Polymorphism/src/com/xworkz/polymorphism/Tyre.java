package com.xworkz.polymorphism;

public class Tyre extends Rubber {
@Override
public void expand()
{
    System.out.println("expand is running in Tyre");
}
public void compress()
{
    System.out.println("running compress in Tyre");
}

}
