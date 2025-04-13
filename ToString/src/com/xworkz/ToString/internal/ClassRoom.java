package com.xworkz.ToString.internal;

public class ClassRoom {
    private String name;


    public ClassRoom(String name) {
        this.name = name;

        System.out.println("No arg const in Class Room");
    }

    @Override
    public String toString() {
        return "ClassRoom name: " + this.name + ", location: ";
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
            if(object instanceof ClassRoom) {
                System.out.println("ref is ClassRoom, will compare...");
                ClassRoom classRoom = this;
                ClassRoom classRoom1 = (ClassRoom) object;
                if(classRoom.name.equals(classRoom1.name)) {
                    return true;
                }
            }
        }
        return false;
    }
}