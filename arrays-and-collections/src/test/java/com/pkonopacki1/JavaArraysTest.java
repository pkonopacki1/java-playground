package com.pkonopacki1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JavaArraysTest {

    // Uninitialized element in 2D array, will be NULL
    @Test
    public void uninitArrayIn2DArray() {
        int[][] array2D = new int[3][];

        array2D[0] = new int[]{1,2,3};
        array2D[1] = new int[]{4,5,6};

        assertEquals(null, array2D[2]);
    }
    
}
