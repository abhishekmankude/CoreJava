package com.xworkz.ToString.internal;

public class Helmet {
    private String brand;
    private String size;


    public Helmet(String brand, String size) {
        this.brand = brand;
        this.size = size;

    }

    @Override
    public String toString() {
        return "Helmet brand: " + this.brand + ", size: " + this.size ;
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
                        helmet.size.equals(helmet1.size)) {
                    return true;
                }
            }
        }
        return false;
    }
}