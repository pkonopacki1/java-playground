package com.pkonopacki1;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Floaters {

    @Test(expected = java.lang.Error.class)
    public void doubleToFloatCastNotPossible() {
        float fValue = 1.5f;
        double dValue = 2.0;

        fValue = dValue;
    }
    
}
