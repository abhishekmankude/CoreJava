package com.xworkxz.inheritance2.NewClasses;

import com.xworkxz.inheritance2.subclass.Smartphone;
import com.xworkxz.inheritance2.superclass.ElectronicDevice;

public class SmartCharger {
    public void chargeDevice(ElectronicDevice device) {
        device.powerOn();
        device.charge();
        device.updateSoftware();
        device.connectToWifi();
        device.powerOff();

        if(device instanceof Smartphone) {
            Smartphone smartphone = (Smartphone)device;
            smartphone.country();
        }
    }
}