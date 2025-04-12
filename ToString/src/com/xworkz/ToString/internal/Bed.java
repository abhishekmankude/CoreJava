package com.xworkz.ToString.internal;

public class Bed {
    private String type;
    private String material;
    private int price;

    public Bed(String type, String material, int price) {
        this.type = type;
        this.material = material;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bed type: " + this.type + ", material: " + this.material + ", price: " + this.price;
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
            if(object instanceof Bed) {
                System.out.println("ref is Bed, will compare...");
                Bed bed = this;
                Bed bed1 = (Bed) object;
                if(bed.type.equals(bed1.type) && bed.material.equals(bed1.material) && bed.price == bed1.price) {
                    return true;
                }
            }
        }
        return false;
    }
}