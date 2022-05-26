package com.pkonopacki1.Arrays;

import java.util.Arrays;

public class JavaArrays {
    public static void main(String[] args) {
        // Array initialization
        int[] singleDimensionalArray = { 1, 2, 3, 4 };
        int[] anotherOne = new int[10];
        // Remember that puting brackets next to type and name of variable, will create
        // a 2D array
        int[] twoDimensionalArray[] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        System.out.println(Arrays.toString(singleDimensionalArray));
        System.out.println(Arrays.toString(anotherOne));
        System.out.println(Arrays.deepToString(twoDimensionalArray));
    }
}
