package com.xworkxz.inheritance2.Runner;


import com.xworkxz.inheritance2.subclass.FrozenPizza;
import com.xworkxz.inheritance2.superclass.FrozenFood;

public class FrozenFoodRunner {
    public static void main(String[] args) {
        FrozenFood frozenFood = new FrozenFood();
        frozenFood.category();
        frozenFood.storageTemp();
        frozenFood.expiryDate();
        frozenFood.origin();
        frozenFood.price();

        FrozenFood frozenFood1 = new FrozenPizza();
        frozenFood1.category();
        frozenFood1.storageTemp();
        frozenFood1.expiryDate();
        frozenFood1.origin();
        frozenFood1.price();

        FrozenPizza frozenPizza = new FrozenPizza();
        frozenPizza.category();
        frozenPizza.storageTemp();
        frozenPizza.expiryDate();
        frozenPizza.origin();
        frozenPizza.price();
    }
}