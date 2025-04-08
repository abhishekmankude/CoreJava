package com.xworkxz.inheritance2.subclass;

import com.xworkxz.inheritance2.superclass.Camera;

public class DSLR extends Camera {
    public DSLR() { System.out.println("DSLR constructor"); }
@Override
public void capture() { System.out.println("DSLR capturing"); }
    public void focus() { System.out.println("DSLR focusing"); }
    public void zoom() { System.out.println("DSLR zooming"); }
    public void store() { System.out.println("DSLR being stored"); }
    public void transferPhotos() { System.out.println("DSLR transferring photos"); }
    public void country(){
        System.out.println("Country is Running");
    }
}