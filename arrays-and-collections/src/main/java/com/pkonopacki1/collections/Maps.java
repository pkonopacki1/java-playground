package com.pkonopacki1.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {

    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        String[] fruitsNames = { "Apple", "Orange", "Banana", "Watermelon" };

        for (int i = 0; i < fruitsNames.length; i++) {
            hashMap.put(fruitsNames[i], i * 5);
            treeMap.put(fruitsNames[i], i * 5);
            linkedHashMap.put(fruitsNames[i], i * 5);
        }

        System.out.println("-----HASH MAP-----");
        putNullIntoMap(hashMap);
        System.out.println("Hash map is ordered randomly: " + hashMap);

        System.out.println("-----TREE MAP-----");
        putNullIntoMap(treeMap);
        System.out.println("Tree map is ordered naturally: " + treeMap);

        System.out.println("-----LINKED HASH MAP-----");
        putNullIntoMap(linkedHashMap);
        System.out.println("Linked hash map is ordered in insertion order: " + linkedHashMap);

        System.out.println("-----USEFUL METHODS-----");
        System.out.println("-----REPLACE-----");
        // Replace with 3 arguments will check if currrent value matches
        hashMap.replace("Apple", 1, 123);
        System.out.println("replace(\"Apple\", 1, 123): " + hashMap);
        hashMap.replace("Apple", 0, 123);
        System.out.println("replace(\"Apple\", 0, 123): " + hashMap);

        System.out.println("-----REMOVE-----");
        // Remove with one argument will just remove
        hashMap.remove("Apple");
        System.out.println("remove(\"Apple\"): " + hashMap);
        // Remove with two arguments will chech if the value matches
        hashMap.remove("Banana", 0);
        System.out.println("remove(\"Banana\", 0): " + hashMap);

        System.out.println("-----PUT IF ABSENT-----");
        hashMap.putIfAbsent("Apple", 0);
        System.out.println("putIfAbsent(\"Apple\", 0): " + hashMap);

        System.out.println("-----COMPUTE-----");
        // Compute uses lambda expression to calculate a value
        hashMap.compute("Watermelon", (k, v) -> v = k.length());
        System.out.println("compute(\"Watermelon\", (k,v) -> v = k.length()): " + hashMap);
    }

    static void putNullIntoMap(Map map) {
        try {
            System.out.print("Putting null key to map of type: " + map.getClass());
            map.put(null, 100);
            System.out.println(" is possible: " + map.get(null));
        } catch (Exception e) {
            System.out.println(" is not possible " + e);
        }

    }

}
