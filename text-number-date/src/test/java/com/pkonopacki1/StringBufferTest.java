package com.pkonopacki1;

import static org.junit.Assert.assertTrue;

import java.security.Timestamp;

import org.junit.Test;

public class StringBufferTest {

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
