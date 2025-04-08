package com.xworkxz.inheritance2.Runner;

import com.xworkxz.inheritance2.NewClasses.Bench;
import com.xworkxz.inheritance2.subclass.Chair;
import com.xworkxz.inheritance2.superclass.Furniture;

public class FurnitureRunner {
    public static void main(String[] args) {
        Furniture furniture = new Furniture();
        furniture.assemble();
        furniture.disassemble();
        furniture.clean();
        furniture.move();
        furniture.polish();

        Furniture furniture1 = new Chair();
        furniture1.assemble();
        furniture1.disassemble();
        furniture1.clean();
        furniture1.move();
        furniture1.polish();

        Chair chair = new Chair();
        chair.assemble();
        chair.disassemble();
        chair.clean();
        chair.move();
        chair.polish();

        //////////////////////////////
        Bench bench = new Bench();
        bench.use(furniture);
        bench.use(chair);
    }
}