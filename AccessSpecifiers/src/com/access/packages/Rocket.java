package com.access.packages;
public class Rocket {
    public String rocketName;
    private int fuelCapacity;
    int launchYear;


    public Rocket() {
        this.rocketName = "Falcon 9";
        this.fuelCapacity = 500;  // 500 tons
        this.launchYear = 2024;
    }


    public void displayRocketName() {
        System.out.println("Rocket Name: " + rocketName);
    }


    private void displayFuelCapacity() {
        System.out.println("Fuel Capacity: " + fuelCapacity + " tons");
    }


    void displayLaunchYear() {
        System.out.println("Launch Year: " + launchYear);
    }


    public void fuelInfo() {
        displayFuelCapacity();
    }
}
