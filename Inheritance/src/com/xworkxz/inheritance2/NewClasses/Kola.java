package com.xworkxz.inheritance2.NewClasses;

import com.xworkxz.inheritance2.subclass.Coffee;
import com.xworkxz.inheritance2.superclass.Beverages;

public class Kola {
    public void range(Beverages beverages) {
        beverages.country();
        beverages.brand();
        beverages.ingredients();
        beverages.price();
        beverages.temperature();

        if(beverages instanceof Coffee)
        {
            Coffee coffee=(Coffee) beverages;
            coffee.country();

        }
    }
}
