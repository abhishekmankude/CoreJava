package com.xworkz.ToString.internal;

public class Mat {
    private String material;
    private String shape;
    private int thickness;

    public Mat(String material, String shape, int thickness) {
        this.material = material;
        this.shape = shape;
        this.thickness = thickness;
    }

    @Override
    public String toString() {
        return "Mat material: " + material + ", shape: " + shape + ", thickness: " + thickness + "mm";
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
                if(mat.material.equals(mat1.material) && mat.shape.equals(mat1.shape) && mat.thickness == mat1.thickness) {
                    return true;
                }
            }
        }
        return false;
    }
}