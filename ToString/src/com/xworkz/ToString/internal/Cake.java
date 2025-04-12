package com.xworkz.ToString.internal;

public class Cake {
    private String bakeryName;
    private String flavour;
    private int price;

    public Cake(String bakeryName, String flavour, int price) {
        this.bakeryName = bakeryName;
        this.flavour = flavour;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cake bakery: " + this.bakeryName + ", flavour: " + this.flavour + ", price: " + this.price;
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
                if(cake.bakeryName.equals(cake1.bakeryName) && cake.flavour.equals(cake1.flavour) && cake.price == cake1.price) {
                    return true;
                }
            }
        }
        return false;
    }
}