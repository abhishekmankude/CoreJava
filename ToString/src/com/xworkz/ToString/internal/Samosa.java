package com.xworkz.ToString.internal;

public class Samosa {
    private String type;
    private String shape;
    private int cost;

    public Samosa(String type, String shape, int cost) {
        this.type = type;
        this.shape = shape;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Samosa type: " + type + ", shape: " + shape + ", cost: " + cost;
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
            if(object instanceof Samosa) {
                System.out.println("ref is Samosa, will compare...");
                Samosa samosa = this;
                Samosa samosa1 = (Samosa) object;
                if(samosa.type.equals(samosa1.type) && samosa.shape.equals(samosa1.shape) && samosa.cost == samosa1.cost) {
                    return true;
                }
            }
        }
        return false;
    }
}