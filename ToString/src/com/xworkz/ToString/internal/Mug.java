package com.xworkz.ToString.internal;

public class Mug {
    private String material;
    private String color;


    public Mug(String material, String color, int price) {
        this.material = material;
        this.color = color;

    }

    public Mug(String porcelain, String white) {
    }

    @Override
    public String toString() {
        return "Mug material: " + material + ", color: " + color;
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
            if (object instanceof Mug) {
                System.out.println("ref is Mug, will compare...");
                Mug mug = (Mug) object;
                return this.material.equals(mug.material) &&
                        this.color.equals(mug.color);
            }
        }
        return false;
    }
}
