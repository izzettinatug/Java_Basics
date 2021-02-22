package com.izzettinatug.denemeler;

public class Statements {

    public static void main(String[] args){

        int x = 5;
        System.out.println(x);
        x = x + 1;
        System.out.println(x);
        x++;
        System.out.println(x);
        x--;
        System.out.println(x);
        x = x * 5;
        System.out.println(x);

        int y = 4;
        System.out.println(x>y);

        System.out.println(x<y);

        y = 30 ;
        System.out.println(x>y);

        System.out.println(x>=y);

        System.out.println(x==y);

        System.out.println(x!=y);

        // and &&
        // or ||

        x=30;
        y=30;
        int z=5;

        System.out.println(x<y && y<z);
        System.out.println(x>y || y<z);


        // if - else  statements
        if (x<y){
            System.out.println("y is bigger ");
        }
        else if(y<x){
            System.out.println("x is bigger ");
        } else{
            System.out.println("x = y");
        }

        // Switch - case



        /*
        if(day==1){
            dayString = "Monday";
        }else if (day == 2) {
            dayString = "Tuesday ";
        } else if(day == 3){
            dayString = "Wednesday";
        }else if {
            dayString = "Sunday";
        }
        */
        int day = 3;
        String dayString = "";


        switch (day){
            case 1:
                dayString = "Monday";
                break;
            case 2:
                dayString = "Tuesday";
                break;
            case 3:
                dayString = "Wednesday";
                break;
            default:
                dayString = " Sunday";
        }
        System.out.println(dayString);



    }
}
