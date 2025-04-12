package com.xworkz.ToString.internal;

public class Speaker {
    private String brand;
    private String type;
    private int price;

    public Speaker(String brand, String type, int price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Speaker brand: " + brand + ", type: " + type + ", price: " + price;
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
            if(object instanceof Speaker) {
                System.out.println("ref is Speaker, will compare...");
                Speaker speaker = this;
                Speaker speaker1 = (Speaker) object;
                if(speaker.brand.equals(speaker1.brand) && speaker.type.equals(speaker1.type) && speaker.price == speaker1.price) {
                    return true;
                }
            }
        }
        return false;
    }
}