package com.xworkxz.inheritance2.NewClasses;

import com.xworkxz.inheritance2.subclass.FrozenPizza;
import com.xworkxz.inheritance2.superclass.FrozenFood;

public class FrozenFish {
    public void prepare(FrozenFood food) {
        food.category();
        food.storageTemp();
        food.expiryDate();
        food.origin();
        food.price();

        if(food instanceof FrozenPizza) {
            FrozenPizza pizza = (FrozenPizza)food;
            pizza.country();
        }
    }
}