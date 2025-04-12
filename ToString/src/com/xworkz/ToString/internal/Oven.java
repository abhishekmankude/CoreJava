package com.xworkz.ToString.internal;

public class Oven {
    private String type;
    private int capacity;
    private int price;

    public Oven(String type, int capacity, int price) {
        this.type = type;
        this.capacity = capacity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Oven type " + this.type + " capacity " + this.capacity + " price " + this.price;
    }

    @Override
    public int hashCode() {
        super.hashCode();
        return 100;
    }

    @Override
    public boolean equals(Object object) {
        if (object != null) {
            System.out.println("ref is not null");
            if (object instanceof Oven) {
                System.out.println("ref is Oven, will compare...");
                Oven oven = (Oven) object;
                return this.type.equals(oven.type) &&
                        this.capacity == oven.capacity &&
                        this.price == oven.price;
            }
        }
        return false;
    }
}
