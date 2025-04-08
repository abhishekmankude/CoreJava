package com.xworkxz.inheritance2.subclass;

import com.xworkxz.inheritance2.superclass.Pulses;

public class Lentils extends Pulses {
    public Lentils() {
        System.out.println("No argument constructor in Lentils");
    }
    @Override
    public void type() {
        System.out.println("Type is running in Lentils");
    }
    public void proteinContent() {
        System.out.println("Protein content is running in Lentils");
    }
    public void weight() {
        System.out.println("Weight is running in Lentils");
    }
    public void origin() {
        System.out.println("Origin is running in Lentils");
    }
    public void price() {
        System.out.println("Price is running in Lentils");
    }
    public void country(){
        System.out.println("Country is Running");
    }}
