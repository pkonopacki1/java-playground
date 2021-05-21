package com.pkonopacki1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class Integers 
{
    @Test
    // We can do it using casting but if value exceeds size, overflow will happen
    public void valueWillOverflowWhenDowncasting()
    {
        byte bVarCast = (byte) 128;
        assertEquals(-128, bVarCast);
    }

    @Test(expected = java.lang.Error.class)
    // Larger value than type size is not possible because of checked exception
    public void exceptionWillBeThrownWhenExceedingVariableSize() {
        byte bVar = 128;
    }

    @Test(expected = java.lang.Error.class)
    public void sumOfBitIsCastToInteger() {
        byte b1 = 5;
        byte b2 = 10;

        byte b3 = b1 + b2;        
    }
}
