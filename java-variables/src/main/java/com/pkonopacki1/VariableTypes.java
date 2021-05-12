package com.pkonopacki1;

/**
 * Hello world!
 *
 */
public class VariableTypes 
{
    public static void main(String[] args) throws Exception {

        // Below won't compile, bigger type can't be convert to lower. 
        // We can do it using casting but if value exceeds size, overflow will happen
        // byte bVar = 128;
        byte bVarCast = (byte) 128;       //This will give -128  
        
        // The other way round is possible
        byte bVar = 127;
        int iVar = bVar;

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
        if(a != 3) System.out.println("Wrong value");        


    }
}
