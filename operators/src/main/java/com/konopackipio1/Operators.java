package com.konopackipio1;


public class Operators 
{
    public static void main( String[] args )
    {
        unaryOperators();
    }


    /**
     * This method shows difference between ++x and x++
     */
    private static void unaryOperators() {
        System.out.println("-----Unary Operators-----");
        int x = 10;
        System.out.println("Value before x++ operations: " + x);
        System.out.println("Value after x++ operation: " + x++);
        System.out.println("Value before ++x operations: " + x);
        System.out.println("Value after ++x operation: " + ++x);      
    }
}
