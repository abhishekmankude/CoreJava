package com.xworkz.References_and_Variables;
public class Minister {
    String ministerName;
    String ministerState;
    String ministerPosition;
    int ministerSalary;
    PersonalAssistan[] pa;


    Minister(String ministerName,String ministerState,String ministerPosition,int ministerSalary,PersonalAssistan[] pa) {
        this.ministerName = ministerName;
        this.ministerState = ministerState;
        this.ministerPosition = ministerPosition;
        this.ministerSalary = ministerSalary;
        this.pa=pa;
    }




    public void ministerDisplay(){
        System.out.println("Mnister Details ");

        System.out.println("Minister Name"+this.ministerName);
        System.out.println("Minister State "+this.ministerState);
        System.out.println("Minister    Position "+this.ministerPosition);
        System.out.println("Minister Salary "+this.ministerSalary);
        System.out.println("----------------------");
        for(PersonalAssistan ref:pa){
            if(ref!=null){
                ref.paDisplay();
                System.out.println("---------------------end of info ------------------------");
            }else System.err.println("Pointing to null");
        }



    }



}
