package com.izzettinatug.denemeler;

import androidx.constraintlayout.solver.ArrayLinkedVariables;

public class Variables {

    public static void main(String[] args){

        //Variables

        // Integer - Long

        int age = 20;
        System.out.println(10 * age);
        System.out.println(age/5);



        //Double - Float

        double z = 5.0;
        double a = 11.0;

        System.out.println(a/z);

        double pi = 3.14;

        int r = 5;

        System.out.println(2 * pi * r);

        //String

        String name = "James";
        String surname = "Hetfeild";
        String fullname = name + " "+ surname;

        System.out.println(name);
        System.out.println(surname);

        System.out.println(fullname);

        //Boolean

        boolean isAlive = true;
        isAlive= false;
        System.out.println(isAlive);

        //Final
        //final ile int değerini sabit hale getirebiliriz.

        int myInteger = 5;
        System.out.println("myInteger: "  +  myInteger);

        myInteger = 6;
        System.out.println("myInteger: " + myInteger);



    }
}
