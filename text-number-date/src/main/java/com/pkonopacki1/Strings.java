package com.pkonopacki1;

public class Strings {
    public static void main(String[] args) {
        // Some useful String methods
        String testString = "This is a test string";

        //Length
        System.out.println(testString.length());

        //equalsIgnoreCase
        String newTeString = testString.toUpperCase();
        System.out.println(newTeString.equalsIgnoreCase(testString));

        //CompareTo, metoda  porównuje na podstawie kolejności alfabetycznej
        //Zwrócona <0 wartość oznacza że obiekt który WYWOŁUJE metodę jest pierwszy w kolejności
        //Duże litery są pierwsze
        System.out.println(newTeString.compareTo(testString));

        //trim
        String notTrimmedString = "   String to be trimmed   ";
        System.out.println(notTrimmedString);
        System.out.println(notTrimmedString.trim());

        System.out.println("cat".compareTo("dog"));
    }
    
}
