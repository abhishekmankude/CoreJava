package com.xworkxz.inheritance2.NewClasses;

import com.xworkxz.inheritance2.subclass.Car;
import com.xworkxz.inheritance2.superclass.Vehicle;

public class Scorpio {
    public void range(Vehicle vehicle) {
        vehicle.honk();
        vehicle.brake();
        vehicle.stop();
        vehicle.accelerate();
        vehicle.start();

        if(vehicle instanceof Car)
        {
            Car car=(Car) vehicle;
            car.country();

        }
    }
}
