package com.app.stu;

import javafx.geometry.Pos;

public class Main {
    public static void main(String [] values)
    {
        Display display=new Display() ;
        Shop shop=new Shop();
        shop.ads(display);

        RCB rcb=new RCB();
        Cricket cricket=new Cricket();
        cricket.details(rcb);

        Poster poster=new Poster();
        Theater theater = new Theater();
        theater.show(poster);

        Galaxy galaxy=new Galaxy();
        Space space=new Space();
        space.travel(galaxy);

        Camera camera=new Camera();
        Pose pose=new Pose();
        pose.photos(camera);

    }
}
