package com.pkonopacki1;

public class CodeOrderClass extends CodeOrderSuperClass{

    static {
        System.out.print("Static block of children class");
    }
    {
        System.out.print("IIB of children class");
    }

    CodeOrderClass() {
        System.out.print("Children class constructor");
    }
   
}
