package com.xworkz.ToString.internal;

public class Bag {
    private String brand;
//    private String color;
//    private int capacity;

    public Bag(String brand) {
        this.brand = brand;
//        this.color = color;
//        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Bag brand: " + this.brand /*+ ", Bag color: " + this.color + ", Bag capacity: " + this.capacity + "L"*/;
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
            if (object instanceof Bag) {
                System.out.println("ref is Bag, will compare...");
                Bag bag = this;
                Bag bag1 = (Bag) object;
                if (bag.brand.equals(bag1.brand) /*&& bag.color.equals(bag1.color) && bag.capacity == bag1.capacity*/) {
                    return true;
                }
            }
        }
        return false;
    }
}
