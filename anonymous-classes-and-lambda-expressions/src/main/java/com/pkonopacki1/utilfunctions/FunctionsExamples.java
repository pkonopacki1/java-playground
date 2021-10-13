package com.pkonopacki1.utilfunctions;

import java.util.function.Function;

public class FunctionsExamples {
    public static void main(String[] args) {

        Function<String, String> repeatTwice = s -> {
            System.out.println("Repeat function");
            return s.repeat(2);
        };
        Function<String, Integer> countString = s -> {
            System.out.println("Count function");
            return s.length();
        };

        // There are two additional methods in function interface, compose and than
        // They differ in the order of execution
        System.out.println(countString.compose(repeatTwice).apply("Hello"));
        System.out.println(repeatTwice.andThen(countString).apply("Hello"));


        
    }
    
}
