package com.xworkz.ToString.internal;

public class Guitar {
    private String type;
    private String brand;


    public Guitar(String type, String brand) {
        this.type = type;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Guitar type: " + this.type + ", brand: " + this.brand ;
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
            if(object instanceof Guitar) {
                System.out.println("ref is Guitar, will compare...");
                Guitar guitar = this;
                Guitar guitar1 = (Guitar) object;
                if(guitar.type.equals(guitar1.type) &&
                        guitar.brand.equals(guitar1.brand)) {
                    return true;
                }
            }
        }
        return false;
    }
}