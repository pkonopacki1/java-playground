package com.pkonopacki1;

/**
 * Hello world!
 *
 */
public class VariableTypes 
{
    public static void main(String[] args) throws Exception {        

        // Float and double differnce
        // float ends with ...f
        float fVar = 1.3f;
        double dVar = 2.3;

        // Same as with integers, won't compile
        // fVar =  dVar;

        // This works fine
        dVar = fVar;

        // This also won't work, byte+byte is converted to int automatically
        byte x = 5;
        byte y = 10;
        // byte z = x + y;
        // To fix it, we can use CASTING
        byte z = (byte) (x + y);

        //----- Other possible integers notations -----//
        int a = 0b0011;
        int b = 1_000_000;

        //Wrapping and unwrapping
        //Wrapping
        Integer intObj = Integer.valueOf(5);
        int intPrimitive = intObj.intValue();
    }
}
