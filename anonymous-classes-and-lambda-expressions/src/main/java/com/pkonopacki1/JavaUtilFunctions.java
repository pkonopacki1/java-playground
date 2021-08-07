package com.pkonopacki1;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.function.Function;

// In this class I explore functions built in java.util.function package

public class JavaUtilFunctions {
    public static void main(String[] args) {
        //-----Example of functional interfaces from java.util.function-----//
        // Unary operator returns same type that accepts. There is also binaryOperator for two arguments
        UnaryOperator<String> addString = s -> s + " I add this sentence";
        // Consumer accepts argument and returns no result
        Consumer<Integer> iPrintInteger = i-> System.out.println("I print this int: " + i);
        // Predicate accepts one argument, returns boolean
        Predicate<String> doIStartWithA = s -> s.charAt(0) == 'A';
        // Supplier return new object, accepts no argument
        Supplier<String> preparedString = () -> new String("I'm freshly prepared String");
        // Function accepts argument and returns differen result type
        Function<String, Integer> howManyCapitalLetters = s -> {
            s = s.replaceAll("\\s","");
            String capitalizedString = s.toUpperCase().replaceAll("\\s","");
            int counter = 0;
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == capitalizedString.charAt(i)) counter++;
            }
            return counter;
        };        
    
        //-----Testing functions-----//
        System.out.println(addString.apply("This is quite useless function:"));
        iPrintInteger.accept(502);
        System.out.println("Word Apple starts with A: " + doIStartWithA.test("Apple"));
        System.out.println(preparedString.get());
        String testSentence = "This is a Test SentencE";
        System.out.println(testSentence + "has " + howManyCapitalLetters.apply(testSentence) + " capital letters");
    }
}
