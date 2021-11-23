package com.konopackipio1;

import java.util.Optional;

public class OptionalMethods {
 
    public static void main(String[] args) {
        testMap();
        
    }
    
    private static void testMap() {
        Optional<Boolean> optional = Optional.of(true);

        optional.map(x -> "Map from optional " + x).ifPresent(System.out::println);

    }
}