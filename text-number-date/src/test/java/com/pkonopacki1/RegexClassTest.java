package com.pkonopacki1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import static com.pkonopacki1.RegexClass.testRegex;

public class RegexClassTest {
    @Test
    public void differentRegexTests()
    {
        // finding a word
        assertEquals(2, testRegex("foofoo", "foo"));
        
        // Using metacharacter '.'
        assertEquals(2, testRegex("Ala ma kotAaaaa", "A."));
        assertEquals(1, testRegex("Ala ma kotA", "A."));

        // Looking for a specific character among set
        assertEquals(2, testRegex("abcde", "[ab]"));
        // Negation of character
        assertEquals(1, testRegex("defg", "[^def]"));

        // Looking among a range    
        assertEquals(2, testRegex("Only Uppercase is counted", "[A-Z]"));
    }
    
}
