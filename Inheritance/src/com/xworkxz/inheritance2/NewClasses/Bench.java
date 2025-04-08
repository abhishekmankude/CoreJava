package com.xworkxz.inheritance2.NewClasses;

import com.xworkxz.inheritance2.subclass.Chair;
import com.xworkxz.inheritance2.superclass.Furniture;

public class Bench {
    public void use(Furniture furniture) {
        furniture.assemble();
        furniture.disassemble();
        furniture.clean();
        furniture.move();
        furniture.polish();

        if(furniture instanceof Chair) {
            Chair chair = (Chair)furniture;
            chair.country();
        }
    }
}