package com.konopackipio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectExample {
    public static void main(String[] args) {
        Set<String> initSet = new TreeSet<>(Set.of("A", "B", "C"));

        // This will not work. Collect accepts consumer, so the supplied object has to be mutable, String is not
        // String result = initSet.parallelStream().collect(String::new, String::concat, String::concat);
        StringBuilder result = initSet.parallelStream()
                                        .map(s -> new StringBuilder(s))
                                        .collect(StringBuilder::new, (a,b) -> a.append(b), (a,b) -> a.append(b));

        StringBuilder result2 = initSet.parallelStream()
                                        .map(s -> new StringBuilder(s))
                                        .reduce(new StringBuilder(), (a,b) -> a.append(b), (a,b) -> a.append(b));


        // Resulst differ for parallel stream, because reduce creates new object every time
        System.out.println("Collcect result: " + result);
        System.out.println("Reduce result: " + result2);

        List<String> stringList = initSet.parallelStream()
                                            .collect(ArrayList::new, (a,b) -> a.add(b), (a,b) -> a.addAll(b));

        System.out.println("Array collect result :" + stringList);


    }
    
}
