package com.xworkz.ToString.internal;

public class Clock {
    private String brand;
    private String style;
    private int price;

    public Clock(String brand, String style, int price) {
        this.brand = brand;
        this.style = style;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Clock brand: " + this.brand + ", style: " + this.style + ", price: " + this.price;
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
                if(clock.brand.equals(clock1.brand) &&
                        clock.style.equals(clock1.style) &&
                        clock.price == clock1.price) {
                    return true;
                }
            }
        }
        return false;
    }
}