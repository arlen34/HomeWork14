package com.company;

public class Singer extends Person {
    private final String bandName;

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public void singing() {
        System.out.println("Singer singing..");
    }

    public void playGitar() {
        System.out.println("Singer playng the gitar..");
    }

    @Override
    public String toString() {

        super.eat();
        super.learn();
        super.walk();
        singing();
        playGitar();
        return "Singer " + "band name is: '" + bandName + '\'' + ' ' + "\n" + getName() + "'s designation is " + getDesignation();
    }
}
