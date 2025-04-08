package com.xworkxz.inheritance2.Runner;

import com.xworkxz.inheritance2.NewClasses.Nikon;
import com.xworkxz.inheritance2.subclass.DSLR;
import com.xworkxz.inheritance2.superclass.Camera;

public class CameraRunner {
    public static void main(String[] args) {
        Camera camera = new Camera();
        camera.capture();
        camera.focus();
        camera.zoom();
        camera.store();
        camera.transferPhotos();

        Camera camera1 = new DSLR();
        camera1.capture();
        camera1.focus();
        camera1.zoom();
        camera1.store();
        camera1.transferPhotos();

        DSLR dslr = new DSLR();
        dslr.capture();
        dslr.focus();
        dslr.zoom();
        dslr.store();
        dslr.transferPhotos();


        Nikon nikon=new Nikon();
        nikon.range(camera);
        nikon.range(dslr);

    }
}