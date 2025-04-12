package com.xworkz.ToString.internal;

public class ClassRoom {
    private String name;
    private String location;
    private int capacity;

    public ClassRoom(String name, String location, int capacity) {
        this.name = name;
        this.location = location;
        this.capacity = capacity;
        System.out.println("No arg const in Class Room");
    }

    @Override
    public String toString() {
        return "ClassRoom name: " + this.name + ", location: " + this.location + ", capacity: " + this.capacity;
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
                if(classRoom.name.equals(classRoom1.name) &&
                        classRoom.location.equals(classRoom1.location) &&
                        classRoom.capacity == classRoom1.capacity) {
                    return true;
                }
            }
        }
        return false;
    }
}