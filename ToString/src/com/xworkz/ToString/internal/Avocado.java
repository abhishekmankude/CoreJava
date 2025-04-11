package com.xworkz.ToString.internal;

public class Avocado
{
    private String variety;
    private int weight;
    private int price;

    public Avocado(String  variety, int weight, int price) {
        this.variety = variety;
        this.weight = weight;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Apple variety: " +  this.variety + ", weight: " +  this.weight + "g, price: " +  this.price;
    }

    @Override
    public int hashCode()
    {
        super.hashCode();
        return 100;

    }


    @Override
    public boolean equals(Object object)
    {
        if(object!=null)
        {
            System.out.println("rel is not null ");
            if(object instanceof Avocado)
            {
                System.out.println("ref is avacado, will compare...");
                Avocado avocado=this;
                Avocado avocado1=(Avocado) object;
                if(avocado.variety.equals(avocado1.variety) && (avocado.price==avocado1.price) && avocado.weight==avocado1.weight )
                {
                    return true;
                }
            }
        }
        return false;

    }

}
