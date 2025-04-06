package com.xworkxz.inheritance2.subclass;

import com.xworkxz.inheritance2.superclass.ElectronicDevice;

public class Smartphone extends ElectronicDevice {
    public Smartphone() { System.out.println("Smartphone constructor"); }

@Override
public void powerOn() { System.out.println("Smartphone powering on"); }
    public void powerOff() { System.out.println("Smartphone powering off"); }
    public void charge() { System.out.println("Smartphone charging"); }
    public void updateSoftware() { System.out.println("Smartphone updating software"); }
    public void connectToWifi() { System.out.println("Smartphone connecting to WiFi"); }
}