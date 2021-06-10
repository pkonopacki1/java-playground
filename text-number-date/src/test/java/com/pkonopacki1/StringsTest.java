package com.pkonopacki1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

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

    // Remember that when using substring, first index is inclusive, the last one is not
    @Test
    public void sungstringIncludesFirstIndexNotLast() {
        String test = "abcdedfg";

        assertEquals("bcd", test.substring(1, 4));
    }
}
