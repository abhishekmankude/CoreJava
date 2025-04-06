package com.xworkxz.inheritance2.subclass;

import com.xworkxz.inheritance2.superclass.CannedGoods;

public class CannedBeans extends CannedGoods { public CannedBeans() { System.out.println("No argument constructor in CannedBeans"); }

    @Override
    public void color() { System.out.println("Color is running in  CannedBeans"); }
    public void kg() { System.out.println("kg is running in CannedBeans"); }
    public void size() { System.out.println("size is running in CannedBeans"); }
    public void origin() { System.out.println("origin is running in CannedBeans"); }
    public void price() { System.out.println("price is running in CannedBeans"); }

}

