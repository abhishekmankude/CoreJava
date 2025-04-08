package com.xworkxz.inheritance2.subclass;

import com.xworkxz.inheritance2.superclass.Building;

public class Skyscraper extends Building {
    public Skyscraper() { System.out.println("Skyscraper constructor"); }
@Override
public void construct() { System.out.println("Skyscraper constructed"); }
    public void demolish() { System.out.println("Skyscraper demolished"); }
    public void paint() { System.out.println("Skyscraper being painted"); }
    public void renovate() { System.out.println("Skyscraper being renovated"); }
    public void occupy() { System.out.println("Skyscraper being occupied"); }
    public void country(){
        System.out.println("Country is Running");
    }
}