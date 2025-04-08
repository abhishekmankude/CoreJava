package com.xworkxz.inheritance2.NewClasses;

import com.xworkxz.inheritance2.subclass.DSLR;
import com.xworkxz.inheritance2.superclass.Camera;

public class Nikon {
    public void range(Camera camera) {
        camera.capture();
        camera.store();
        camera.focus();
        camera.zoom();
        camera.transferPhotos();

        if( camera instanceof DSLR)

        {
           DSLR dslr=(DSLR) camera;
           dslr.country();

        }
    }

}
