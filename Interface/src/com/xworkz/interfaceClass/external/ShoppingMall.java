package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Mall;

public class ShoppingMall implements Mall {
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
