package com.pkonopacki1.utilfunctions;

import java.util.function.Predicate;

public class PredicateExamples {
    public static void main(String[] args) {
        Predicate<String> startsWithA = s -> s.charAt(0) == 'A';
        Predicate<String> endsWithA = s -> s.charAt(s.length() - 1) == 'a';

        // There are more predicate methods in a Predicate interface:
        Predicate<String> doesNotStartWithA = startsWithA.negate();
        System.out.println("Banana does not start with A: " + doesNotStartWithA.test("Banana"));

        // Or
        System.out.println("Banana starts with A or ends with a: " + startsWithA.or(endsWithA).test("Banana"));

        // And
        System.out.println("Anna starts with A and ends with a: " + startsWithA.and(endsWithA).test("Anna"));

        // isEqual static
        System.out.println("Predicate is equal on two hello words: " + Predicate.isEqual("hello").test("hello"));

        // not static
        System.out.println("And negation of above: " + Predicate.not(Predicate.isEqual("hello")).test("hello"));

    }
    
}
