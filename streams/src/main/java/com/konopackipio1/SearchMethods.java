package com.konopackipio1;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SearchMethods {
    public static void main(String[] args) {
        Random r = new Random();

        // Find first
        Optional<Integer> randomInt = Stream
                                        .generate(() -> r.nextInt(100))
                                        .peek(System.out::println)
                                        .findFirst(); // findAny could be used, but there is no guarantee it will return
                                                      // first object
        System.out.println("Found int: " + randomInt.get());

        // Any match - although limit is 5, stream will break faster if 5 will be found faster
        Boolean anyMatch = Stream
                            .generate(() -> r.nextInt(6))
                            .limit(5)
                            .peek(i -> System.out.print(i + " "))
                            .anyMatch(i -> i == 5);
        System.out.println("Any equal to 5: " + anyMatch);

        // All match
        Boolean allMatch = Stream
                            .generate(() -> r.nextInt(6))
                            .limit(5)
                            .peek(i -> System.out.print(i + " "))
                            .allMatch(i -> i < 5);
        System.out.println("All less than 5: " + allMatch);

        // min, max
        Optional<Integer> min= Stream
                            .generate(() -> r.nextInt(1000))
                            .limit(5)
                            .peek(i -> System.out.print(i + " "))
                            .min(Comparator.naturalOrder());
        System.out.println("min value: " + min.get());

        // sum, avarage - they both need mapToInt
        OptionalDouble average = Stream
                                .generate(() -> r.nextInt(100))
                                .limit(5)
                                .peek(i -> System.out.print(i + " "))
                                .mapToInt(s -> s)
                                .average();
        System.out.println("average: " + average.getAsDouble());

        // reduce - below example shows how to get sum withou IntStream
        Optional<Integer> sum = Stream
                            .generate(() -> r.nextInt(10))
                            .limit(5)
                            .peek(i -> System.out.print(i + " "))
                            .reduce(Integer::sum);
        System.out.println("sum value: " + sum.get());

        // Primitive statistics
        IntSummaryStatistics intStats = IntStream.range(1, 10).summaryStatistics();
        System.out.println("Int statistics: " + intStats);
    }
    
}
