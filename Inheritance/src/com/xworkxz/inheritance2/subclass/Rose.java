package com.xworkxz.inheritance2.subclass;

import com.xworkxz.inheritance2.superclass.Plant;

public class Rose extends Plant {
    public Rose() { System.out.println("Rose constructor"); }

@Override

public void grow() { System.out.println("Plant growing"); }
    public void photosynthesize() { System.out.println("Rose photosynthesizing"); }
    public void absorbWater() { System.out.println("Rose absorbing water"); }
    public void produceOxygen() { System.out.println("Rose producing oxygen"); }
    public void bloom() { System.out.println("Rose blooming"); }

}