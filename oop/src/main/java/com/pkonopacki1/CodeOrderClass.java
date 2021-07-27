package com.pkonopacki1;

public class CodeOrderClass extends CodeOrderSuperClass{

    static {
        System.out.println("Static block of children class");
    }
    {
        System.out.println("IIB of children class");
    }

    CodeOrderClass() {
        System.out.println("Children class constructor");
    }
   
}

class TestCodeOrder {
    public static void main(String[] args) {
        CodeOrderClass codeOrderClass = new CodeOrderClass();
    }
}
