package com.xworkz.ToString.internal;

public class Pharmacy {
    private String name;
    private String location;
    private int rating;

    public Pharmacy(String name, String location, int rating) {
        this.name = name;
        this.location = location;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Pharmacy name: " + name + ", location: " + location + ", rating: " + rating;
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
            if(object instanceof Pharmacy) {
                System.out.println("ref is Pharmacy, will compare...");
                Pharmacy pharmacy = this;
                Pharmacy pharmacy1 = (Pharmacy) object;
                if(pharmacy.name.equals(pharmacy1.name) && pharmacy.location.equals(pharmacy1.location) && pharmacy.rating == pharmacy1.rating) {
                    return true;
                }
            }
        }
        return false;
    }
}