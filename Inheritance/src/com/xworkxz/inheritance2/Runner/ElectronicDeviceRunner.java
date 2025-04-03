package com.xworkxz.inheritance2.Runner;

import com.xworkxz.inheritance2.subclass.Smartphone;
import com.xworkxz.inheritance2.superclass.ElectronicDevice;

public class ElectronicDeviceRunner {
    public static void main(String[] args) {
        ElectronicDevice device = new ElectronicDevice();
        device.powerOn();
        device.powerOff();
        device.charge();
        device.updateSoftware();
        device.connectToWifi();

        ElectronicDevice device1 = new Smartphone();
        device1.powerOn();
        device1.powerOff();
        device1.charge();
        device1.updateSoftware();
        device1.connectToWifi();

        Smartphone smartphone = new Smartphone();
        smartphone.powerOn();
        smartphone.powerOff();
        smartphone.charge();
        smartphone.updateSoftware();
        smartphone.connectToWifi();
    }
}