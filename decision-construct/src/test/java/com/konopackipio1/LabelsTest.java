package com.konopackipio1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LabelsTest {


    @Test
    public void testLabelWithContinue() {
        int outerLoopLength = 10;
        int innerLoopLength = 10;

        int i = 0;
        int j = 0;

        OUTER_LOOP:
        for (i = 0; i < outerLoopLength; i++) {
            for(j = 0; j < innerLoopLength; j++) {
                if(i*j > 80) {
                    continue OUTER_LOOP;
                }
            }            
        }

        assertEquals(10, i);
        assertEquals(9, j);
    }

    @Test
    public void testLabelWithBreak() {
        int outerLoopLength = 10;
        int innerLoopLength = 10;

        int i = 0;
        int j = 0;

        OUTER_LOOP:
        for (i = 0; i < outerLoopLength; i++) {
            for(j = 0; j < innerLoopLength; j++) {
                if(i*j > 80) {
                    break OUTER_LOOP;
                }
            }            
        }

        assertEquals(9, i);
        assertEquals(9, j);
    }
    
}
