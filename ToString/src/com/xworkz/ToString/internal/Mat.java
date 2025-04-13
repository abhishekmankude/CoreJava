package com.xworkz.ToString.internal;

public class Mat {
    private String material;
    private String shape;


    public Mat(String material, String shape, int thickness) {
        this.material = material;
        this.shape = shape;

    }

    public Mat(String yoga, String blue) {
    }

    @Override
    public String toString() {
        return "Mat material: " + material + ", shape: " + shape ;
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
            if(object instanceof Mat) {
                System.out.println("ref is Mat, will compare...");
                Mat mat = this;
                Mat mat1 = (Mat) object;
                if(mat.material.equals(mat1.material) && mat.shape.equals(mat1.shape)) {
                    return true;
                }
            }
        }
        return false;
    }
}