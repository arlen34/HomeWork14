package com.company;

public class Person {
    private final String name;
    private final String designation;


    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public void learn() {
        System.out.println("Learning something...");
    }

    public void walk() {
        System.out.println("Walk in evening...");
    }

    public void eat() {
        System.out.println("Eat sometimes...");
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }
}
