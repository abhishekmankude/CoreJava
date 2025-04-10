package com.xworkz.ToString.internal;

public class Chess {
        private String boardMaterial;
        private String pieceColor;
        private int price;

        public Chess(String boardMaterial, String pieceColor, int price) {
            this.boardMaterial = boardMaterial;
            this.pieceColor = pieceColor;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Chess board material " + this.boardMaterial + " piece color " + this.pieceColor + " price " + this.price;
        }
    @Override
    public int hashCode()
    {
        super.hashCode();
        return 100;

    }
}
