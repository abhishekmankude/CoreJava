package com.xworkz.References_and_Variables;

public class Security {
    int securityCode;
    Personalc personalc;



    //Personalc[] personalcs={personalc1,personalc2};
    public Security(int securityCode,Personalc personalc){
        this.securityCode=securityCode;
        this.personalc=personalc;

    }

    public void securityDisplay(){
        System.out.println("Security Code"+this.securityCode);

        if(this.personalc!=null){
            this.personalc.personalDisplay();
        }else System.err.println("Pointing to null");

    }
}