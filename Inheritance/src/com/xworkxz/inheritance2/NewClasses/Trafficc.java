package com.xworkxz.inheritance2.NewClasses;

import com.xworkxz.inheritance2.subclass.TrafficSub;
import com.xworkxz.inheritance2.superclass.Traffic;

public class Trafficc {
    public void displayTrafficInfo(Traffic traffic) {
        traffic.color();
        traffic.kg();
        traffic.size();
        traffic.origin();
        traffic.price();

        if (traffic instanceof TrafficSub) {
            TrafficSub trafficSub = (TrafficSub) traffic;
            trafficSub.country();
        }
        System.out.println("--------------------");
    }
}