package com.xworkz.ToString.internal;

public class Cake {
    private String bakeryName;

    public Cake(String bakeryName) {
        this.bakeryName = bakeryName;

    }

    @Override
    public String toString() {
        return "Cake bakery: " + this.bakeryName ;
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
            if(object instanceof Cake) {
                System.out.println("ref is Cake, will compare...");
                Cake cake = this;
                Cake cake1 = (Cake) object;
                if(cake.bakeryName.equals(cake1.bakeryName) ) {
                    return true;
                }
            }
        }
        return false;
    }
}