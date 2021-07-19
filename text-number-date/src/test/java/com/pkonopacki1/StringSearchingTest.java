package com.pkonopacki1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringSearchingTest {

    @Test
    public void lastIndexOfTest() {
        String testString ="testwordtestword";

        assertEquals(8, testString.lastIndexOf("test"));
        // int index informs where method should start looking and goes BACKWARDS
        assertEquals(0, testString.lastIndexOf("test", 7));
        // Interesting thing to notice here, although fromIndex is in the middle of looked phrase, it returns its index
        assertEquals(8, testString.lastIndexOf("test", 9));
    }
    
}
