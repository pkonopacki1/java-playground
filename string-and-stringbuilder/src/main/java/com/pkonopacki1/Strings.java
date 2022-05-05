package com.pkonopacki1;

import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        testCompare();
        testTrim();
        testValueOf();
        testSubstring();
        testSplit();

    }

    private static void testCompare() {
        System.out.println("-----TEST COMPARE-----");

        String testString = "This is a test string";
        String newTestString = testString.toUpperCase();

        //CompareTo, metoda  porównuje na podstawie kolejności alfabetycznej
        //Zwrócona <0 wartość oznacza że obiekt który WYWOŁUJE metodę jest pierwszy w kolejności
        //Duże litery są pierwsze
        System.out.println("Compare: " + newTestString + " to : " + testString + " : :" + newTestString.compareTo(testString));
        String[] stringArray = {testString, newTestString};
        System.out.println("Array of string before sorting: ");
        System.out.println(Arrays.toString(stringArray));
        Arrays.sort(stringArray);
        System.out.println("Array of string after sorting: ");
        System.out.println(Arrays.toString(stringArray));
    }

    private static void testTrim() {
        System.out.println("-----TEST TRIM-----");

        // Trim removes empty characters before and after
        String notTrimmedString = "   String to be trimmed   ";
        System.out.println(notTrimmedString + " string length: " + notTrimmedString.length());
        System.out.println("String after trimming: " + notTrimmedString.trim() + " string length: " + notTrimmedString.trim().length());
    }

    private static void testValueOf() {
        System.out.println("-----TEST VALUE OF-----");
        int x = 5;
        float f = 3.14f;
        boolean b = false;
        char[] chars = {'a', 'b', 'c', 'd'};

        System.out.println("Value of int: " + String.valueOf(x));
        System.out.println("Value of float: " + String.valueOf(f));
        System.out.println("Value of boolean: " + String.valueOf(b));
        System.out.println("Value of char[] from 2 to 4: " + String.valueOf(chars, 2, 2));
    }

    private static void testSubstring() {
        System.out.println("-----TEST VALUE OF-----");

        String testString = "Test string";
        System.out.println("substring(5): " + testString.substring(5));
    }

    private static void testSplit() {
        System.out.println("-----TEST SPLIT-----");

        String testString = "abc:def:ghi:mno";
        System.out.println("split(\":\"): " + Arrays.toString(testString.split(":")));
        System.out.println("split(\":\":, 3): " + Arrays.toString(testString.split(":", 3)));
    }
    
}
