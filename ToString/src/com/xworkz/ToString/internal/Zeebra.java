package com.xworkz.ToString.internal;

public class Zeebra {
    private String zooName;
    private int ticketPrice;
    private String owner;

    public Zeebra(String zooName, String owner, int ticketPrice) {
        this.zooName = zooName;
        this.owner = owner;
        this.ticketPrice = ticketPrice;
    }

    @Override
    public String toString() {
        return "Zoo name: " + zooName + ", owner: " + owner + ", ticket price: " + ticketPrice;
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
            if(object instanceof Zeebra) {
                System.out.println("ref is Zeebra, will compare...");
                Zeebra zeebra = this;
                Zeebra zeebra1 = (Zeebra) object;
                if(zeebra.zooName.equals(zeebra1.zooName) && zeebra.owner.equals(zeebra1.owner) && zeebra.ticketPrice == zeebra1.ticketPrice) {
                    return true;
                }
            }
        }
        return false;
    }
}