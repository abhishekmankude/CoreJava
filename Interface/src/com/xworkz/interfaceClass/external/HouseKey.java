package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Key;

public class HouseKey implements Key {
    @Override
    public void insert() {
        System.out.println("Inserting the house key into the lock");
    }

    @Override
    public void turn() {
        System.out.println("Turning the house key to unlock");
    }

    @Override
    public void remove() {
        System.out.println("Removing the house key from the lock");
    }
}
