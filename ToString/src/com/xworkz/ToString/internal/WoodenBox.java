package com.xworkz.ToString.internal;

public class WoodenBox {
        private String material;
        private String shape;
        private int weight;

        public WoodenBox(String material, String shape, int weight) {
            this.material = material;
            this.shape = shape;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "WoodenBox material " + this.material + " shape " + this.shape + " weight " + this.weight;
        }


    @Override
    public int hashCode()
    {
        super.hashCode();
        return 100;

    }
}
