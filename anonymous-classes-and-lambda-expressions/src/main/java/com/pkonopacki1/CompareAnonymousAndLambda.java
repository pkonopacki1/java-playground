package com.pkonopacki1;

public class CompareAnonymousAndLambda {
    public static void main(String[] args) {
        // Anonymoous class took 6 lines
        FunctionalInterface functionalInterface = new FunctionalInterface(){
            @Override
            public void mySpecialFunction() {
                System.out.println("I'm in anonymous class");
            }
        };

        // Lambda expression took 1 line
        FunctionalInterface functionalInterface2 = () -> System.out.println("I'm in lambda");

        functionalInterface.mySpecialFunction();
        functionalInterface2.mySpecialFunction();
    }    
}
