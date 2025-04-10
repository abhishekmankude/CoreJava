package com.xworkz.ToString.internal;

public class Fan {
    private String type;
    private int cost;
    private int speed;

    public Fan(String type, int cost, int speed){
        this.type=type;
        this.cost=cost;
        this.speed=speed;
    }

    @Override
    public String toString() {
        return "Fan type "+this.type+" Fan cost "+this.cost+" Fan speed "+this.speed;
    }

    @Override
    public int hashCode()
    {
        super.hashCode();
        return 100;

    }}
