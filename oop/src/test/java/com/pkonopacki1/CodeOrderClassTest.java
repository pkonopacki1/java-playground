package com.pkonopacki1;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

public class CodeOrderClassTest {
    private static PrintStream standardOut = System.out;
    private static ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void testCodeOrder() {
        CodeOrderClass codeOrderClass = new CodeOrderClass();

        assertEquals("Static block of children classSuper class constructor" + 
        "IIB of children classChildren class constructor", outputStream.toString().trim());
    }
    
}
