package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Lilly;
import com.xworkz.interfaceClass.internal.Shampoo;
import com.xworkz.interfaceClass.internal.Glass;
import com.xworkz.interfaceClass.internal.Dentist;
import com.xworkz.interfaceClass.internal.Pilot;
import com.xworkz.interfaceClass.internal.Zoo;

public class Sun implements Lilly, Shampoo, Glass, Dentist, Pilot, Zoo {

    // Lilly methods
    @Override
    public void bloom() {
        System.out.println("The sun is making the Lilly bloom");
    }

    @Override
    public void fragrance() {
        System.out.println("The Lilly's fragrance spreads under the sun");
    }

    @Override
    public void wilt() {
        System.out.println("The Lilly wilts in the scorching sun");
    }

    // Shampoo methods
    @Override
    public void apply() {
        System.out.println("Applying shampoo under the morning sun");
    }

    @Override
    public void lather() {
        System.out.println("Lathering the shampoo with sunlight streaming in");
    }

    @Override
    public void rinse() {
        System.out.println("Rinsing hair with warm water heated by the sun");
    }

    // Glass methods
    @Override
    public void clean() {
        System.out.println("Cleaning glass that sparkles in the sunlight");
    }

    @Override
    public void fill() {
        System.out.println("Filling the glass with sunlight-infused water");
    }

    @Override
    public void breakGlass() {
        System.out.println("The sunlight glints as the glass breaks");
    }

    // Dentist methods
    @Override
    public void cleanTeeth() {
        System.out.println("Cleaning teeth in bright daylight");
    }

    @Override
    public void fillCavity() {
        System.out.println("Filling cavity with focus under the dentist's lamp, bright as the sun");
    }

    @Override
    public void removeTooth() {
        System.out.println("Removing a tooth in a sunlit clinic");
    }

    // Pilot methods
    @Override
    public void takeOff() {
        System.out.println("Pilot takes off into the rising sun");
    }

    @Override
    public void fly() {
        System.out.println("Flying above the clouds, closer to the sun");
    }

    @Override
    public void land() {
        System.out.println("Landing with the sunset on the horizon");
    }

    // Zoo methods
    @Override
    public void displayAnimals() {
        System.out.println("Displaying animals basking in the sun");
    }

    @Override
    public void organizeTours() {
        System.out.println("Organizing sunny day tours in the zoo");
    }

    @Override
    public void conserveSpecies() {
        System.out.println("Conserving species and their sunny habitats");
    }
}
