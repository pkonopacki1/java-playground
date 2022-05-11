package com.pkonopacki1;

import java.util.Arrays;
import java.util.Random;

/**
 * This class show usefullness of Arrays class
 */
public class ArraysManipulation {
    public static void main(String[] args) {
        // Inside this method you can see first use of Arrays class
        int[] testArr = createRandomArray(10, 100);
        System.out.println("Array before manipulation: " + Arrays.toString(testArr));

        int searchedInt = testArr[4];

        // Sorting
        Arrays.sort(testArr);
        System.out.println("Array after sorting: " + Arrays.toString(testArr));

        System.out.println("Inedx of " + searchedInt + ": " + Arrays.binarySearch(testArr, searchedInt));
        // In case of not found returns -index-1
        System.out.println("Inedx for number not found " + 101 + ": " + Arrays.binarySearch(testArr, 101));
    }

    private static int[] createRandomArray(int size, int max) {
        Random r = new Random();
        int[] arr = new int[size];

        Arrays.setAll(arr, i -> i = r.nextInt(max));

        return arr;
    }
    
}
