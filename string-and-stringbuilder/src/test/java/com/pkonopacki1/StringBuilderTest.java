package com.pkonopacki1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * This test shows that for concatenating many string, it's more optimal to use stringbuilder
 */
public class StringBuilderTest {

    @Test
    public void stringBufferIsFasterForConcatenation() {
        String testString = "Hello";
        StringBuilder testStringBuilder = new StringBuilder(testString);

        long timeStartString = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++) {
            testString += " world";
        }
        long timeEndString = System.currentTimeMillis();

        long timeStartStringBuilder = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++) {
            testStringBuilder.append(" hello");
        }
        long timeEndStringBuilder = System.currentTimeMillis();

        long timeForStringEvaluation = timeEndString - timeStartString;
        long timeForStringBuilderEvaluation = timeEndStringBuilder - timeStartStringBuilder;

        assertTrue(timeForStringEvaluation > timeForStringBuilderEvaluation);
    }
    
}
