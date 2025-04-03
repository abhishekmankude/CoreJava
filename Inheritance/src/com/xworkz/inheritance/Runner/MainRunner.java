package com.xworkz.inheritance.Runner;

import com.xworkz.inheritance.SubClass.*;
import com.xworkz.inheritance.SuperClass.Shoe;
import com.xworkz.inheritance.SuperClass.TrafficLight;

public class MainRunner {
    public static void main(String[] args) {
        Shoe shoe = new Shoe();
        shoe.color();
        shoe.brand();
        shoe.lase();
        shoe.price();
        shoe.sole();

        Nike nike = new Nike();
        nike.brand();
        nike.lase();
        nike.lase();
        nike.sole();
        nike.price();

        Shoe shoe1 = new Nike();
        shoe1.sole();
        shoe1.price();
        shoe1.brand();
        shoe1.lase();
        shoe1.color();

        Adidas adidas = new Adidas();
        adidas.brand();
        adidas.lase();
        adidas.color();
        adidas.sole();
        adidas.price();

        Shoe shoe2 = new Adidas();
        shoe2.brand();
        shoe2.lase();
        shoe2.color();
        shoe2.sole();
        shoe2.price();

        Sparx sparx = new Sparx();
        sparx.brand();
        sparx.lase();
        sparx.sole();
        sparx.price();
        sparx.color();

        TrafficLight trafficLight=new TrafficLight();
        trafficLight.color();

        RedLight redLight=new RedLight();
        redLight.color();

        TrafficLight trafficLight1=new RedLight();
        trafficLight1.color();

        GreenLight greenLight=new GreenLight();
        greenLight.color();

        TrafficLight trafficLight2=new GreenLight();
        trafficLight2.color();
    }
}

