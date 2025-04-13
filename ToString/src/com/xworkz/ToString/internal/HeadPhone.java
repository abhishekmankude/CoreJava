package com.xworkz.ToString.internal;

public class HeadPhone {
    private String brand;
    private String type;


    public HeadPhone(String brand, String type, int price) {
        this.brand = brand;
        this.type = type;

    }

    public HeadPhone(String sony, String type) {
    }

    @Override
    public String toString() {
        return "HeadPhone brand: " + this.brand + ", type: " + this.type ;
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
            if(object instanceof HeadPhone) {
                System.out.println("ref is HeadPhone, will compare...");
                HeadPhone headPhone = this;
                HeadPhone headPhone1 = (HeadPhone) object;
                if(headPhone.brand.equals(headPhone1.brand) &&
                        headPhone.type.equals(headPhone1.type)) {
                    return true;
                }
            }
        }
        return false;
    }
}