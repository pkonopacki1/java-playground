package com.pkonopacki1;

class CodeOrderClass extends CodeOrderSuperClass{

    static {
        System.out.println("Static block of children class");
    }
    {
        System.out.println("IIB of children class");
    }

    CodeOrderClass() {
        System.out.println("Children class constructor");
    } 

    CodeOrderClass(String message) {
        System.out.println("Overloaded version constructor: " + message);
    }
}

 class CodeOrderSuperClass {
    static {
        System.out.println("Static block of super class");
    }
    {
        System.out.println("IIB of super class");
    }

    CodeOrderSuperClass() {
        System.out.println("Super class constructor");
    }
}


public class TestCodeOrder {
    public static void main(String[] args) {
        new CodeOrderClass();
        System.out.println("------Another object creation-----");
        new CodeOrderClass("hello");
    }
}
