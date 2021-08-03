package com.pkonopacki1;

import java.util.ArrayList;

public class CastingArraysClass {
    public static void main(String[] args) {
        ArrayList<Number> numberList = new ArrayList<>();  
        ArrayList<Integer> integerList = new ArrayList<>();
        
        // Below code shows that Arrays need to be of exact type
        // numberList = integerList;
        // integerList = numberList;

        // Below example shows the difference between raw list and typed list. Raw need castng when getting the data.
        ArrayList<String> typedList = new ArrayList<>();
        ArrayList rawList = new ArrayList<>();

        typedList.add("Hello");
        rawList.add("Hello");

        System.out.println(typedList.get(0).charAt(0));
        System.out.println(((String)rawList.get(0)).charAt(0));

    }

}
