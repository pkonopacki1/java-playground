package com.konopackipio1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class StreamCollectors {
    public static void main(String[] args) {
        List<String> initStringData = new ArrayList<>(List.of("Tomasz", "Cyprian", "Piotr", "Łukasz"));

        // testJoining(initStringData);
        // testAveraging(initStringData);
        // testToMap(initStringData);
        // testGroupingBy(initStringData);
        testPartioningBy(initStringData);

    }

    private static void testJoining(List<String> list) {       
        // Collectors.join
        String joinedString = list.stream().collect(Collectors.joining());
        System.out.println(joinedString);

        String joinedString2 = list.stream().collect(Collectors.joining(", "));
        System.out.println(joinedString2);
    }

    private static void testAveraging(List<String> list) {
        double averageLength = list.stream().collect(Collectors.averagingInt(String::length));

        System.out.println("Average length: " + averageLength);
    }

    private static void testToMap(List<String> list) {
        // Map<Integer, String> map = list.stream().collect(Collectors.toMap(String::length, s -> s, (s1, s2) -> s1 + ", " + s2));
        Map<Integer, Set<String>> map = list.stream().collect(Collectors.toMap(String::length,
                                                                s ->  {
                                                                    Set<String> set = new HashSet<>();
                                                                    set.add(s);
                                                                    return set;
                                                                }, 
                                                                (s1, s2) -> {
                                                                    s1.addAll(s2);
                                                                    return s1;
                                                                }));
        System.out.println(map);
    }

    // Easier than in toMap
    private static void testGroupingBy(List<String> list) {
        Map<Integer, Set<String>> map = list.stream().collect(Collectors.groupingBy(String::length, Collectors.toSet()));
        System.out.println(map);
    }

    private static void testPartioningBy(List<String> list) {
        var map = list.stream().collect(Collectors.partitioningBy(s -> s.length() > 6));

        for (Boolean boolKey : map.keySet()) {
            System.out.println(boolKey + ": " + map.get(boolKey));
        } 
            
        
    }



    

    
    
    
}
