package com.xworkz.ToString.internal;

public class Camera {
    private String brand;


    public Camera(String brand) {
        this.brand = brand;

    }

    @Override
    public String toString() {
        return "Camera brand: " + this.brand + ", megapixels: ";
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
            if(object instanceof Camera) {
                System.out.println("ref is Camera, will compare...");
                Camera camera = this;
                Camera camera1 = (Camera) object;
                if(camera.brand.equals(camera1.brand))
                {
                    return true;
                }
            }
        }
        return false;
    }
}