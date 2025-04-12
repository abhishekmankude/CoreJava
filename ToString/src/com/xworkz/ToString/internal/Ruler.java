package com.xworkz.ToString.internal;

public class Ruler {
    private int length;
    private String material;
    private int price;

    public Ruler(int length, String material, int price) {
        this.length = length;
        this.material = material;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ruler length: " + length + "cm, material: " + material + ", price: " + price;
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
            if(object instanceof Ruler) {
                System.out.println("ref is Ruler, will compare...");
                Ruler ruler = this;
                Ruler ruler1 = (Ruler) object;
                if(ruler.length == ruler1.length && ruler.material.equals(ruler1.material) && ruler.price == ruler1.price) {
                    return true;
                }
            }
        }
        return false;
    }
}