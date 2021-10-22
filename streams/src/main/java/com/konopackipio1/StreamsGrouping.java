package com.konopackipio1;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsGrouping {
    public static void main(String[] args) {
        Random r = new Random();

        //Grouping by
        Map<Integer, Long> intMap = Stream
                                        .generate(() -> r.nextInt(3))
                                        .limit(10)
                                        .collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()));
        System.out.println(intMap);

        // Partioning by
        Map<Boolean, List<Integer>> evenOddNumbers = Stream   
                                                .generate(()-> r.nextInt(10))
                                                .limit(20)
                                                .collect(Collectors.partitioningBy((i) -> i%2 == 0));
        System.out.println(evenOddNumbers.get(true));
    }
    
}
