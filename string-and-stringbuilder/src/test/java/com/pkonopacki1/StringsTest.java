package com.pkonopacki1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StringsTest 
{
    @Test
    public void stringsAreImmutable()
    {
        String test = "test";
        String test1 = "test";

        assertTrue(test == test1);
    }

    // New String() creates new object. We can use .intern() to point to same place
    @Test
    public void stringNewConstructorCreatesNewObect() {
        String test = "test";
        String test1 = new String("test");

        assertTrue(test != test1);
        assertTrue(test == test1.intern());
    }
}
