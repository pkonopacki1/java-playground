package com.pkonopacki1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class EncapsulationClassTest {

    // This test shows, that we should remeber that if we pass a reference object, we should create a new object, 
    // to avoid editing object variable by changing reference
    @Test
    public void testEncapsulation() {
        EncapsulationClass ec = new EncapsulationClass();

        StringBuilder sb1 = new StringBuilder("Test");
        
        ec.setWrongSbEncapsulation(sb1);
        ec.setGoodSbEncapsulation(sb1);
        sb1.append(" seems to be wrong");

        assertTrue(!ec.getWrongSbEncapsulation().toString().equals("Test"));
        assertTrue(ec.getGoodSbEncapsulation().toString().equals("Test"));

    }
    
}
