package com.xworkz.ToString.internal;

public class Light {
    private String company;
    private  String type;
    private int cost;

    public Light(String company,String type,int cost){
        this.company=company;
        this.cost=cost;
        this.type=type;
    }

    @Override
    public String toString() {
        return "Light company "+this.company+" Light cost "+this.cost+" Light Type "+this.type;
    }

    @Override
    public int hashCode()
    {
        super.hashCode();
        return 100;

    }}
