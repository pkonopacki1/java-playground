package com.pkonopacki1;

public class ValidLambdas {

    //------ Setup for presentation of valid lambdas------//
    interface SingleCalculation {
        int calculate(int a);
    }

    interface DoubleCalculation {
        int calculate(int a, int b);
    }

    static void testCalculation(SingleCalculation sc, int a) {
        System.out.println(sc.calculate(a));
    }

    static void testCalculation(DoubleCalculation dc, int a, int b) {
        System.out.println(dc.calculate(a, b));
    }

    //------Available lambda expressions-----//
    // With single parameter, parentheses are not required
    static SingleCalculation square = a -> a*a;
    // Defining type requires parentheses
    static SingleCalculation increment = (int a) -> a + 1;
    // Using 'return' requires brackets
    static SingleCalculation cube = a -> {
        return a*a*a;
    };

    //Remember, you cann not mix var and declared type
    // static DoubleCalculation sum = (int a, var b) -> a + b;

    //-----Testing-----//
    public static void main(String[] args) {
        testCalculation(square, 5);
        testCalculation(increment, 122);
        testCalculation(cube, 4);
    }
}
