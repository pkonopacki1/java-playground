package com.pkonopacki1;

import java.util.Arrays;
import java.util.Collections;
import java.util.ListIterator;

public class ArraysManipulation {
    public static void main(String[] args) {
        Integer[] intArray = new Integer[10];

        Arrays.setAll(intArray, (x) -> x*x);
        Arrays.sort(intArray, Collections.reverseOrder());

        System.out.println(Arrays.toString(intArray));

        // Using of iterator
        ListIterator it = Arrays.asList(intArray).listIterator();

        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println("\n----Reverese order----");
        while(it.hasPrevious()) {
            System.out.print(it.previous() + " ");
        }
    }
    
}
