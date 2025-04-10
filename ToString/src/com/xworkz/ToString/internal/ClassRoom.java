package com.xworkz.ToString.internal;

public class ClassRoom {
    private String name;
    private String location;
    private int capacity;

    public ClassRoom(String name,String location,int capacity)
    {
        this.capacity=capacity;
        this.location=location;
        this.name=name;
        System.out.println("No arg const in Class Room");
    }
    @Override
    public String toString()
    {
        return "Name :"+this.name+", Capacity :"+this.capacity+", Location :"+this.location;
    }
    @Override
    public int hashCode()
    {
        super.hashCode();
        return 100;

    }

}
