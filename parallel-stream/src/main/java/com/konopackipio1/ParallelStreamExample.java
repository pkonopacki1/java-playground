package com.konopackipio1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParallelStreamExample 
{
    public static void main( String[] args )
    {
        long timeStart;
        long timeEnd;
        List<Integer> exampleList = Stream
                                        .iterate(1, (t) -> t < 20, (s) -> s + 1)
                                        .collect(Collectors.toList());

        timeStart = System.currentTimeMillis();
        System.out.println("Regular stream: ");
        exampleList.stream()
                    .forEach((i) -> {
                        System.out.print(i + " ");
                    });
        timeEnd = System.currentTimeMillis();
        System.out.println("\nForeach in regular stream took: " + (timeEnd - timeStart));        

        System.out.println("Parallel stream: ");
        exampleList.parallelStream()
                    .forEach((i) -> {
                        System.out.print(i + " ");
                    });
                
        timeStart = System.currentTimeMillis();
        // Below I show not only ordered foreach, but also different method for creating parallel stream
        System.out.println("\nParallel ordered stream: ");
        exampleList.stream()
                    .parallel()
                    .forEachOrdered((i) -> {
                        System.out.print(i + " ");
                    });
        timeEnd = System.currentTimeMillis();
        System.out.println("\nForeachordered in parallel stream took: " + (timeEnd - timeStart));   

        

        
    }
}
