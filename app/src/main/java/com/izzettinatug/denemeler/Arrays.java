package com.izzettinatug.denemeler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Arrays {

    public static void main(String[] args){

        //Array

        String[] myStringArray = new String[3];

        myStringArray[0] = "James";
        myStringArray[1] = "Lars";
        myStringArray[2] = "Kirk";

        System.out.println(myStringArray[0]);

        int[] myIntegerArray = new int[3];
        myIntegerArray[0] = 50;
        myIntegerArray[1] = 60;
        myIntegerArray[2] = 70;

        System.out.println(myIntegerArray[0]);

        int[] myNumberArray = {1,2,3,4,5,6,7,8};
        System.out.println(myNumberArray[2]);

        //Lists

        ArrayList<String> myMusicians = new ArrayList<>();

        myMusicians.add("Lars");
        myMusicians.add("James");
        myMusicians.add(1, "Kirk");
        myMusicians.add("Rob");

        System.out.println(myMusicians.get(0));
        System.out.println(myMusicians.get(1));
        System.out.println(myMusicians.get(2));
        System.out.println(myMusicians.get(3));

        System.out.println(myMusicians.size());

        //Set

        HashSet<String> mySet = new HashSet<String>();

        mySet.add("James");
        mySet.add("James");

        System.out.println(mySet.size());

        //HashMap

        HashMap<String, String> myHashMap = new HashMap<>();

        myHashMap.put("name", "James");
        myHashMap.put("Instrument", "Guitar");

        System.out.println(myHashMap.get("name"));
        System.out.println(myHashMap.get("Instrument"));

        HashMap<String, Integer> mySecondMap = new HashMap<>();

        mySecondMap.put("run", 100);
        mySecondMap.put("basketball", 200);

        System.out.println(mySecondMap.get("run"));




    }

}
