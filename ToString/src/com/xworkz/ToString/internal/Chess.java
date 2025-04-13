package com.xworkz.ToString.internal;

public class Chess {
        private String boardMaterial;

        public Chess(String boardMaterial) {
            this.boardMaterial = boardMaterial;

        }

        @Override
        public String toString() {
            return "Chess board material " + this.boardMaterial + " piece color ";
        }
    @Override
    public int hashCode()
    {
        super.hashCode();
        return 100;

    }
    public boolean equals(Object object)
    {
        if(object!=null)
        {
            System.out.println("ref is not null");
            if(object instanceof Chess)
            {
                System.out.println("ref is Chess, will compare...");
                Chess chess=this;
                Chess chess1=(Chess) object;
                if(chess.boardMaterial.equals(chess1.boardMaterial))
                {
                    return true;
                }
            }
        }
        return  false;
    }
}
