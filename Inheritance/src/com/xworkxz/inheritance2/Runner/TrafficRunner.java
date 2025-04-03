package com.xworkxz.inheritance2.Runner;

import com.xworkxz.inheritance2.subclass.TrafficSub;
import com.xworkxz.inheritance2.superclass.Traffic;

public class TrafficRunner
{
    public static void main(String[] args) {
        Traffic traffic=new Traffic();
        traffic.size();
        traffic.kg();
        traffic.color();
        traffic.origin();
        traffic.price();

        TrafficSub trafficSub=new TrafficSub();
        trafficSub.size();
        trafficSub.kg();
        trafficSub.color();
        trafficSub.origin();
        trafficSub.price();

        Traffic traffic1=new Traffic();
        traffic.size();
        traffic.kg();
        traffic.color();
        traffic.origin();
        traffic.price();


    }
}
