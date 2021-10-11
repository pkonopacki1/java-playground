package com.pkonopacki1.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {

    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        TreeMap treeMap = new TreeMap<>();
        LinkedHashMap linkedHashMap = new LinkedHashMap<>();

        String [] fruitsNames = {"Apple", "Orange", "Banana", "Watermelon"};

        for(int i = 0; i < fruitsNames.length; i++) {
            hashMap.put(fruitsNames[i], i*5);
            treeMap.put(fruitsNames[i], i*5);
            linkedHashMap.put(fruitsNames[i], i*5);
        }

        putNullIntoMap(hashMap);
        putNullIntoMap(treeMap);
        putNullIntoMap(linkedHashMap);        

        // Hash map is random ordered
        System.out.println(hashMap);
        // Tree map is naturally ordered
        System.out.println(treeMap);
        // Linked hash map is ordered as an insert order
        System.out.println(linkedHashMap);

        // Replace with 3 arguments will check if currrent value matches
        hashMap.replace("Apple", 1, 123);
        System.out.println("replace(\"Apple\", 1, 123): " + hashMap);
        hashMap.replace("Apple", 0, 123);
        System.out.println("replace(\"Apple\", 0, 123): " + hashMap);

        // Remove with one argument will just remove
        hashMap.remove("Apple");
        System.out.println("remove(\"Apple\"): " + hashMap);
        // Remove with two arguments will chech if the value matches
        hashMap.remove("Banana", 0);
        System.out.println("remove(\"Banana\", 0): " + hashMap);

        hashMap.putIfAbsent("Apple", 0);
        System.out.println("putIfAbsent(\"Apple\", 0): " + hashMap);

        // Compute uses lambda expression to calculate a value
        hashMap.compute("Watermelon", (k,v) -> v = k.length());
        System.out.println("compute(\"Watermelon\", (k,v) -> v = k.length()): " + hashMap);
    }

    static void putNullIntoMap(Map map) {
        try {
            map.put(null, 100);            
        } catch (Exception e) {
            System.out.println(e + " can not add null key to " + map.getClass());
        }      

    }
    
}
