package com.xworkxz.inheritance2.subclass;

import com.xworkxz.inheritance2.superclass.Mushrooms;

public class ButtonMushroom extends Mushrooms {
    public ButtonMushroom() { System.out.println("No argument constructor in ButtonMushroom"); }

    @Override
    public void color() { System.out.println("Color is running in ButtonMushroom"); }
    public void kg() { System.out.println("Kg is running in ButtonMushroom"); }
    public void size() { System.out.println("Size is running in ButtonMushroom"); }
    public void origin() { System.out.println("Origin is running in ButtonMushroom"); }
    public void price() { System.out.println("Price is running in ButtonMushroom"); }
    public void country(){
        System.out.println("Country is Running");
    }

}
