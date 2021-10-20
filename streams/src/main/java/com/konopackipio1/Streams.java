package com.konopackipio1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        // Creating streams
        Stream s1 = Stream.empty();
        Stream s2 = Stream.of(1,2,3);

        Stream s3 = Stream.generate(Math::random);
        // s3.limit(10).forEach(System.out::println);

        List list = new ArrayList<>(List.of(1,2,3));
        Stream s4 = list.stream();


        // Using Stream.Builder
        Stream.Builder<String> sBuilder = Stream.<String>builder();
        String test = "one two three";
        for(String s: test.split("\\s")) {
            sBuilder.accept(s);            
        }
        Stream s5 = sBuilder.build();
        s5.forEach(System.out::println);
        // You can't invoke build method after building
        try {
            s5 = sBuilder.build();
        } catch (Exception e) {
            System.out.println("You can't invoke build after it has already been done: " + e);
        }


        // Using terminal operation twice
        s2.forEach(System.out::println);
        try {
            s2.count();
        } catch (IllegalStateException e) {
            System.out.println("You can't use terminal operation on a stream that already has been prcossed: " + e);
        }

        // Stream iterate
        Integer x = Stream
            .iterate(10, t -> t < 100, t -> t +5)
            .reduce((a,b) -> a+b).get();
        System.out.println("Sum of iterate generated stream:" + x);
        
        

    }
    
}
