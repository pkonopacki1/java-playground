package com.pkonopacki1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class StringsTest 
{
    @Test
    public void stringsAreImmutable()
    {
        String test = "test";
        String test1 = "test";

        assertEquals(test.hashCode(), test1.hashCode());
    }
}
