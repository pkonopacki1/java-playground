package com.pkonopacki1.utilfunctions;

import java.util.function.Consumer;

public class ConsumerExamples {
    public static void main(String[] args) {
        Consumer<String> print = s -> System.out.println(s);
        Consumer<String> printWithSuprise = s -> System.out.println(s + " suprise!");

        print.andThen(printWithSuprise).accept("Test");
    }
    
}
