package com.xworkz.ToString.internal;

public class Jug {
    private String color;
    private int capacity;
    private String shape;

    public Jug(String color,int capacity,String shape)
    {
        this.color=color;
        this.capacity=capacity;
        this.shape=shape;

        System.out.println("no arg const in Jug");
    }
    @Override
    public String toString()
    {
        return "Color :"+this.color+", Capacity :"+this.capacity+", Shape :"+this.color;

    }
}
