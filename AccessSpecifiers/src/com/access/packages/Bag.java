package com.access.packages;


public class Bag {
    public String brand;
    private int cost;
    int noOfZips;


    public Bag()
    {
        this.brand="Adidas";
        this.cost=999;
        this.noOfZips=5;
    }
    public void displayBrand()
    {
        System.out.println("The bag brand is :"+brand);


    }
    private void displayCost()
    {
        System.out.println("cost of the bag is :"+cost);
    }
    void displayNoOfZip()
    {
        System.out.println("number of zip is :"+noOfZips);
    }
    public void costDisplay()
    {
        displayCost();
    }


}
