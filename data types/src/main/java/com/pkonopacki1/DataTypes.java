package com.pkonopacki1;

/**
 * 
 *  Primitive data types available in Java
 * 
 * 
 */
public class DataTypes 
{
    public static void main(String[] args) throws Exception {        

        //-----FLOATERS------//
        // float ends with ...f
        float fVar = 1.3f;
        double dVar = 2.3;


        //-----DATA CAPACITY-----///
        // This will not compile as float has a smaller capacity than double
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
    }
}
