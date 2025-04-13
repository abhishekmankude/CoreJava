package com.xworkz.ToString.internal;

public class Drone {
    private String brand;


    public Drone(String brand) {
        this.brand = brand;

    }

    @Override
    public String toString() {
        return "Drone brand: " + this.brand + ", camera quality: " ;
    }

    @Override
    public int hashCode() {
        super.hashCode();
        return 100;
    }

    @Override
    public boolean equals(Object object) {
        if(object != null) {
            System.out.println("ref is not null");
            if(object instanceof Drone) {
                System.out.println("ref is Drone, will compare...");
                Drone drone = this;
                Drone drone1 = (Drone) object;
                if(drone.brand.equals(drone1.brand) ) {
                    return true;
                }
            }
        }
        return false;
    }
}