package com.pkonopacki1;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class JavaArraysTest 
{

    @Test
    public void testArraysEqual() {
        int[] firstArray = {1,2,3};
        int[] secondArray = {1,2,3};


        // it's better to use equas Arrays util method, than Object.equals
        assertTrue(!firstArray.equals(secondArray));
        assertTrue(Arrays.equals(firstArray, secondArray));


    }

}
