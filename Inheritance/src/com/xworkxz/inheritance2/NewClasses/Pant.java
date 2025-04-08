package com.xworkxz.inheritance2.NewClasses;

import com.xworkxz.inheritance2.subclass.Shirt;
import com.xworkxz.inheritance2.superclass.Clothing;

public class Pant {
    public void range(Clothing clothing) {
    clothing.dry();
    clothing.dry();
    clothing.iron();
    clothing.wash();
    clothing.iron();

    if(clothing instanceof Shirt)
    {
        Shirt shirt=(Shirt) clothing;
        shirt.country();

    }
    }
}
