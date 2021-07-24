package com.pkonopacki1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OperatorsTest {

    @Test
    // With postfix operator, the value is increased only after the expression is finished
    // (end of the line, end of if, end of loop expression)
    public void preAndPostIncrementDifference() {
        int x = 1;
        assertEquals(2, ++x);
        x = 1;
        assertEquals(1, x++);
        assertEquals(2, x);
    }
    
}
