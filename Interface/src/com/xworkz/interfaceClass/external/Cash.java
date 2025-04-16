package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Money;

public class Cash implements Money {
    @Override
    public void earn() {
        System.out.println("Earning money through work or investments");
    }

    @Override
    public void save() {
        System.out.println("Saving money for future needs");
    }

    @Override
    public void spend() {
        System.out.println("Spending money on goods and services");
    }
}
