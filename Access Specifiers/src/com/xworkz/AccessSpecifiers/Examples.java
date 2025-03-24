package com.xworkz.AccessSpecifiers;

public class Examples {
    public String name;
    String Location;
    private String Gender="Male";


    public void Display(String name) {
        System.out.println("Displaying public method");
        System.out.println(name);
    }

    void DisplayPackage(String Location)
    {
        System.out.println("Displaying package level methods");
        System.out.println(Location);
    }

    private void DemoDisplay(String Gender) {
        System.out.println("Displaying private method");
        System.out.println(Gender);
    }



}
