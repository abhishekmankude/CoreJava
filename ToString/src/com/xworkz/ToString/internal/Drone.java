package com.xworkz.ToString.internal;

public class Drone {
    private String brand;
    private String cameraQuality;
    private int price;

    public Drone(String brand, String cameraQuality, int price) {
        this.brand = brand;
        this.cameraQuality = cameraQuality;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Drone brand: " + this.brand + ", camera quality: " + this.cameraQuality + ", price: " + this.price;
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
                if(drone.brand.equals(drone1.brand) &&
                        drone.cameraQuality.equals(drone1.cameraQuality) &&
                        drone.price == drone1.price) {
                    return true;
                }
            }
        }
        return false;
    }
}