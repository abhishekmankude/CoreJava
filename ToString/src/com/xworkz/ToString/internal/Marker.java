package com.xworkz.ToString.internal;

public class Marker {
    private String color;
    private String brand;
    private int price;

    public Marker(String color, String brand, int price) {
        this.color = color;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Marker color: " + color + ", brand: " + brand + ", price: " + price;
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
            if(object instanceof Marker) {
                System.out.println("ref is Marker, will compare...");
                Marker marker = this;
                Marker marker1 = (Marker) object;
                if(marker.color.equals(marker1.color) && marker.brand.equals(marker1.brand) && marker.price == marker1.price) {
                    return true;
                }
            }
        }
        return false;
    }
}