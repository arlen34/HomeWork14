package com.company;

public class Programmer extends Person{
    private final String companyName;

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }
    public void coding(){
        System.out.println( "Programmer coding......");
    }

    @Override
    public String toString() {
        super.eat();
        super.walk();
        super.learn();
        coding();
        return "Name is "+getName()+".\n"+getName()+"'s designation is "+getDesignation()+" and his company name is <"+companyName+">.";
    }
}
