package com.konopackipio1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReduceExample {

    public static void main(String[] args) {

        List<Integer> initList = Stream.iterate(0, t -> t < 10, t -> t+1).collect(Collectors.toList());

        // In two below results you can see that:
        //  - for serial reduce, identity is uses once
        //  - for parallel reduce, identity MAY be uses always
        Integer serialResult = initList.stream()
        .reduce(1, (x1, x2) -> x1 + x2);

        System.out.println("Serial reduce result: " + serialResult);

        Integer result = initList.stream()
                .parallel()
                .reduce(1, (x1, x2) -> x1 + x2, (x1, x2) -> x1+x2);

        System.out.println("Reduce result: " + result);
    }

}
