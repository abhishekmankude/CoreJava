package com.xworkz.ToString.internal;

public class Clock {
    private String brand;


    public Clock(String brand) {
        this.brand = brand;

    }

    @Override
    public String toString() {
        return "Clock brand: " + this.brand + ", style: ";
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
            if(object instanceof Clock) {
                System.out.println("ref is Clock, will compare...");
                Clock clock = this;
                Clock clock1 = (Clock) object;
                if(clock.brand.equals(clock1.brand)) {
                    return true;
                }
            }
        }
        return false;
    }
}