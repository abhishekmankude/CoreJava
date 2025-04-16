package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Lens;

public class CameraLens implements Lens {
    @Override
    public void focus() {
        System.out.println("Focusing the camera lens");
    }

    @Override
    public void zoom() {
        System.out.println("Zooming the camera lens");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the camera lens");
    }
}
