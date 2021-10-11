package com.pkonopacki1.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionsViews {
    
    public static void main(String[] args) {
        String[] arrayStrings = {"Adam", "Tomek", "Ryszard"};    
        List<String> immutableList = Arrays.asList(arrayStrings);    
        List<String> subList = immutableList.subList(1, 3);

        System.out.println("Initial string array: " + immutableList);
        subList.replaceAll(s->s + "test");
        System.out.println("String array after manipulation substring: " + immutableList);

        try {
            subList.clear();
        } catch (Exception e) {
            System.out.println("Can't change size of sublist" + e);
        }

        String[] arrayStrings2 = {"Adam", "Tomek", "Ryszard"};  
        List<String> mutableList = new ArrayList<>(Arrays.asList(arrayStrings2));
        subList = mutableList.subList(1, 3);

        System.out.println("Initial string array: " + mutableList);
        subList.replaceAll(s->s + "test");
        System.out.println("String array after manipulation substring: " + mutableList);
        subList.clear();
        System.out.println("String array after clearing substring: " + mutableList);
        
    }
    
}
