package com.xworkz.ToString.internal;

public class Umbrella {
    private String color;
    private int length;
    private int price;

    public Umbrella(String color, int length, int price) {
        this.color = color;
        this.length = length;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Umbrella color: " + color + ", length: " + length + "cm, price: " + price;
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
            if(object instanceof Umbrella) {
                System.out.println("ref is Umbrella, will compare...");
                Umbrella umbrella = this;
                Umbrella umbrella1 = (Umbrella) object;
                if(umbrella.color.equals(umbrella1.color) && umbrella.length == umbrella1.length && umbrella.price == umbrella1.price) {
                    return true;
                }
            }
        }
        return false;
    }
}