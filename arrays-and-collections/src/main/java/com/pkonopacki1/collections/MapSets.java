package com.pkonopacki1.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapSets {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap<>(Map.of("John", 100, "Ana", 200, "Adam", 300));
        Set entrySet = hashMap.entrySet();


        // Below example shows that you need to remove exact entry from map
        entrySet.remove("John");
        System.out.println(hashMap);
        entrySet.remove(Map.entry("John", 100));
        System.out.println(hashMap);

        // Set just of values will allow removing by value
        Collection values = hashMap.values();
        values.remove(200);
        System.out.println(hashMap);

        // Set just of keys will allow removing just by key
        Collection keys = hashMap.keySet();
        keys.remove("Adam");
        System.out.println(hashMap);
        

    }
    
}
