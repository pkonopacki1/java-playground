package com.pkonopacki1.utilfunctions;

import java.util.function.Function;

class ExampleClass {
    String name;

    public ExampleClass(String name) {
        this.name = name;
    }

    
}

public class MethodReference {
    public static void main(String[] args) {
        // This requires a class to have a constructor with String parameter
        Function<String, ExampleClass> function = ExampleClass::new;
        
    }
    
}
