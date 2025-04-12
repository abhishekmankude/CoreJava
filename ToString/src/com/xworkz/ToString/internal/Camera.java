package com.xworkz.ToString.internal;

public class Camera {
    private String brand;
    private int megapixels;
    private boolean hasFlash;

    public Camera(String brand, int megapixels, boolean hasFlash) {
        this.brand = brand;
        this.megapixels = megapixels;
        this.hasFlash = hasFlash;
    }

    @Override
    public String toString() {
        return "Camera brand: " + this.brand + ", megapixels: " + this.megapixels + "MP, flash: " + this.hasFlash;
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
                if(camera.brand.equals(camera1.brand) &&
                        camera.megapixels == camera1.megapixels &&
                        camera.hasFlash == camera1.hasFlash) {
                    return true;
                }
            }
        }
        return false;
    }
}