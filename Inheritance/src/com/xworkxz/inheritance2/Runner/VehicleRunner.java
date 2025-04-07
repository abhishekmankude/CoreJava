package com.xworkxz.inheritance2.Runner;

import com.xworkxz.inheritance2.NewClasses.Scorpio;
import com.xworkxz.inheritance2.subclass.Car;
import com.xworkxz.inheritance2.superclass.Vehicle;

public class VehicleRunner {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.start();
        vehicle.stop();
        vehicle.accelerate();
        vehicle.brake();
        vehicle.honk();

        Vehicle vehicle1 = new Car();
        vehicle1.start();
        vehicle1.stop();
        vehicle1.accelerate();
        vehicle1.brake();
        vehicle1.honk();

        Car car = new Car();
        car.start();
        car.stop();
        car.accelerate();
        car.brake();
        car.honk();

        Scorpio scorpio=new Scorpio();
        scorpio.range(vehicle);
        scorpio.range(car);
    }
}