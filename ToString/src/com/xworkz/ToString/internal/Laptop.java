package com.xworkz.ToString.internal;

public class Laptop {
    private String brand;
    private String processor;


    public Laptop(String brand, String processor) {
        this.brand = brand;
        this.processor = processor;

    }

    @Override
    public String toString() {
        return "Laptop brand " + this.brand + " processor " + this.processor;
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
            if(object instanceof Laptop) {
                System.out.println("ref is Laptop, will compare...");
                Laptop lap = this;
                Laptop lap1 = (Laptop) object;
                if(lap.brand.equals(lap1.brand) && lap.processor.equals(lap1.processor)) {
                    return true;
                }
            }
        }
        return false;
    }
}