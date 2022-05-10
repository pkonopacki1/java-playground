package com.pkonopacki1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringMethodsTest {

        // Remember that when using substring, first index is inclusive, the last one is not
        @Test
        public void sungstringIncludesFirstIndexNotLast() {
            String test = "abcdedfg";
    
            assertEquals("bcd", test.substring(1, 4));
        }
}
