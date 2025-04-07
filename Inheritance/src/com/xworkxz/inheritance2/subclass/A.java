package com.xworkxz.inheritance2.subclass;

import com.xworkxz.inheritance2.superclass.AlphabetsStartingFrom;

public class A extends AlphabetsStartingFrom {
    public A()
    {
        System.out.println("non arg const in A");
    }

    @Override
    public void sizeOfAlphabet()
    {
        System.out.println("size of alphabets is running in A");
    }

    @Override
    public void positionOfAlphabet()
    {
        System.out.println("position of alphabets is running in A");
    }
    public void country(){
        System.out.println("Country is Running");
    }
}
