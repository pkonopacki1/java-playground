package com.pkonopacki1.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Maps {

    public static void main(String[] args) {
        HashMap hashMap = new HashMap<>();
        TreeMap treeMap = new TreeMap<>();
        LinkedHashMap linkedHashMap = new LinkedHashMap<>();

        String [] fruitsNames = {"Apple", "Orange", "Banana", "Watermelon"};

        for(int i = 0; i < fruitsNames.length; i++) {
            hashMap.put(fruitsNames[i], i*5);
            treeMap.put(fruitsNames[i], i*5);
            linkedHashMap.put(fruitsNames[i], i*5);
        }
        System.out.println(hashMap);
        System.out.println(treeMap);
        System.out.println(linkedHashMap);
    }
    
}
