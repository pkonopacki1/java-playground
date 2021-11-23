package com.konopackipio1;

import java.util.List;


public class StreamMethods {
    public static void main(String[] args) {
        testReduce();
        testReduceParallel();

    }

    private static void testReduce() {
        System.out.println("-----TEST REDUCE SEQUENTIAL-----");
        List<String> initStringLIst = List.of("abc", "defg", "mnop");

        int stringsLengthsSum = initStringLIst.stream().reduce(0, 
            (i, s) -> {
               int sum =  i + s.length();
               System.out.println("accumulator: " + sum);
               return sum;}, 
            (i, j) -> {
            int sum = i +j;
            System.out.println("combiner: " + sum);
            return sum;
        });

        System.out.println("Strings length sum from sequential: " + stringsLengthsSum);
    }

    // The third parameter is useful only in parallel 
    private static void testReduceParallel() {
        System.out.println("-----TEST REDUCE PARALLEL-----");
        List<String> initStringLIst = List.of("abc", "defg", "mnop");

        int stringsLengthsSum = initStringLIst.stream().parallel().reduce(0, 
            (i, s) -> {
               int sum =  i + s.length();
               System.out.println("accumulator: " + sum);
               return sum;}, 
            (i, j) -> {
            int sum = i +j;
            System.out.println("combiner: " + sum);
            return sum;
        });


        System.out.println("Strings length sum from parallel: " + stringsLengthsSum);
    }
    
}
