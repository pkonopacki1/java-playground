package com.pkonopacki1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class ArraysManipulationTest {

    // Changing the sublist, changes also the original array
    @Test
    public void testSublist() {
        Integer[] intArray = new Integer[5];

        Arrays.setAll(intArray, x -> x*2);
        List subList = Arrays.asList(intArray).subList(0, 3);
        subList.sort(Collections.reverseOrder());

        assertTrue(Arrays.equals(intArray, new Integer[]{4,2,0,6,8}));
    }

    // But comparing to sublist, substring creates new array
    @Test
    public void testSubstring() {
        Integer[] intArray = new Integer[5];

        Arrays.setAll(intArray, x -> x*2);
        Integer[] copiedArray = Arrays.copyOfRange(intArray, 0, 3);
        Arrays.sort(copiedArray, Collections.reverseOrder());
        assertTrue(Arrays.equals(intArray, new Integer[]{4,2,0,6,8}));
    }
    
}
