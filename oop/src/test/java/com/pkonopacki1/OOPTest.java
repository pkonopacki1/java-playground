package com.pkonopacki1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class OOPTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void passingByValue() {
        int i = 5;
        OOP.doublePrimitiveData(i);
        assertEquals(5, i);
    }


    // In below two tests, we can see that Java in reality is PASS-BY-VALUE!!!
    // We can change the parameters of object at which reference object points at
    // But we are not changing the value of reference object itself
    @Test
    public void passingByReferenceChangingValues() {
        int i = 5;
        OOP oop = new OOP(i);
        oop.doubleObjectParameter(oop);
        assertEquals(10, oop.a);
    }

    @Test
    public void passingByReferenceChangingObject() {
        Object x = new Object();
        OOP.nullObject(x);
        assertNotEquals(null, x);
    }
}
