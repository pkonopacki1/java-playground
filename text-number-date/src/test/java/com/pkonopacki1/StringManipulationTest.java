package com.pkonopacki1;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class StringManipulationTest {

    @Test
    public void testStringJoin() {
        String[] words = {"Hello", "World"};
        List<String> listOfWords = new ArrayList<>(Arrays.asList(words));

        String joinedString = String.join(" ", listOfWords);
        assertEquals("Hello World", joinedString);        
    }

    @Test
    public void testStringSplit() {
        String sentence = "Hello World!";
        var splitWords = sentence.split(" ");

        assertEquals(splitWords[0], "Hello");
        assertEquals(splitWords[1], "World!");
    }
    
}
