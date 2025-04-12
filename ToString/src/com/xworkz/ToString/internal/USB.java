package com.xworkz.ToString.internal;

public class USB {
    private String brand;
    private int storageCapacity;
    private String type;

    public USB(String brand, int storageCapacity, String type) {
        this.brand = brand;
        this.storageCapacity = storageCapacity;
        this.type = type;
    }

    @Override
    public String toString() {
        return "USB brand: " + brand + ", storageCapacity: " + storageCapacity + "GB, type: " + type;
    }

    @Override
    public int hashCode() {
        super.hashCode();
        return 100;
    }

    @Override
    public boolean equals(Object object) {
        if(object != null) {
            System.out.println("ref is not null");
            if(object instanceof USB) {
                System.out.println("ref is USB, will compare...");
                USB usb = this;
                USB usb1 = (USB) object;
                if(usb.brand.equals(usb1.brand) && usb.storageCapacity == usb1.storageCapacity && usb.type.equals(usb1.type)) {
                    return true;
                }
            }
        }
        return false;
    }
}