package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Mall;
import com.xworkz.interfaceClass.internal.Zudio;

public class Park implements Zudio, Mall {
    @Override
    public void design() {
        System.out.println("Designing new collections");
    }

    @Override
    public void display() {
        System.out.println("Displaying products");
    }

    @Override
    public void discount() {
        System.out.println("Offering discounts");
    }
    @Override
    public void open() {
        System.out.println("Opening the shopping mall");
    }

    @Override
    public void close() {
        System.out.println("Closing the shopping mall");
    }

    @Override
    public void offerDeals() {
        System.out.println("Offering deals and discounts at the shopping mall");
    }
}
