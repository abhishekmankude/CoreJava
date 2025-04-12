package com.xworkz.ToString.internal;

public class Helmet {
    private String brand;
    private String size;
    private String color;

    public Helmet(String brand, String size, String color) {
        this.brand = brand;
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Helmet brand: " + this.brand + ", size: " + this.size + ", color: " + this.color;
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
            if(object instanceof Helmet) {
                System.out.println("ref is Helmet, will compare...");
                Helmet helmet = this;
                Helmet helmet1 = (Helmet) object;
                if(helmet.brand.equals(helmet1.brand) &&
                        helmet.size.equals(helmet1.size) &&
                        helmet.color.equals(helmet1.color)) {
                    return true;
                }
            }
        }
        return false;
    }
}