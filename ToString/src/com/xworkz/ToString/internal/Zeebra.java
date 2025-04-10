package com.xworkz.ToString.internal;

public class Zeebra {
    private String zooName;
    private int ticketPrice;
    private String owner;

    public Zeebra(String zooName,String owner,int ticketPrice){
        this.zooName=zooName;
        this.owner=owner;
        this.ticketPrice=ticketPrice;
    }

    @Override
    public String toString() {
        return "Zoo brand "+this.zooName+" Zoo cost "+this.owner+" Zoo Color "+this.ticketPrice;
    }
    @Override
    public int hashCode()
    {
        super.hashCode();
        return 100;

    }
}
