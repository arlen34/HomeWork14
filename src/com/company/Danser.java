package com.company;

public class Danser extends Person{
    private final String groupName;

    public Danser(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }
    public void dancing(){
        System.out.println( "Danser dansing all time.......");
    }
    @Override
    public String toString(){
        super.eat();
        super.learn();
        super.walk();
        dancing();
        return  "Dancer's name is "+ getName()+"\nDancer's designation is "+getDesignation()+"\nDancer's group name is "+groupName;
    }
}
