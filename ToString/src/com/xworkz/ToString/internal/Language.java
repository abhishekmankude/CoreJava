package com.xworkz.ToString.internal;

public class Language {
    private String name;
    private String areaUsed;
    private int age;

    public Language(String name,String areaUsed,int age){
        this.name=name;
        this.areaUsed=areaUsed;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Language name "+this.name+" Language used "+this.areaUsed+" Language age "+this.age;
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
            if(object instanceof Language) {
                System.out.println("ref is Language, will compare...");
                Language lang = this;
                Language lang1 = (Language) object;
                if(lang.name.equals(lang1.name) && lang.areaUsed.equals(lang1.areaUsed) && lang.age == lang1.age) {
                    return true;
                }
            }
        }
        return false;
    }
}