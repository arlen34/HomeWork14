package com.company;

public class Main {

    public static void main(String[] args) {
        Danser danser= new Danser("Maikl Jekson","dancer","One Dance");
        Programmer programmer=new Programmer("Arlen","Programmer","NASA");
        Singer singer=new Singer("Selena","Singer","Queen");

        System.out.println(danser);
        System.out.println();
        System.out.println(programmer);
        System.out.println();
        System.out.println(singer);
    }
}
