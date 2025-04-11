package com.xworkz.ToString.exampleInternal;

//== check the location only not the values  and used only for primituive
//equals should be used for String

public class Tshirts {
private  int size;
private String brand;
private String quality;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }


    @Override
    public boolean equals(Object object)
    {
        if(object!=null)
        {
            System.out.println("ref is not null");
            if(object instanceof Tshirts)
            {
                System.out.println("ref is Tshirt,will compare");
                Tshirts tshirts=this;
                Tshirts tshirts1=(Tshirts) object;
                if(tshirts.brand.equals(tshirts1.brand) && tshirts.size==tshirts1.size && tshirts.quality.equals(tshirts1.quality))
                {
                    System.out.println("they are equal");
                    return true;

                }
            }
        }
        return false;
    }
}
