package com.konopackipio1;

public class WrapperClasses 
{
    public static void main( String[] args )
    {
        //Creating
        Integer wrappedInt = Integer.valueOf(10);
        // Parse int returns int
        int intFromString = Integer.parseInt("15");
        // valueOf returns Integer
        Integer integerFromString = Integer.valueOf("20");
        int intVariable = wrappedInt.intValue();

        //Equals - important, equals accept null and will return false
        Long longValue = 10l;
        System.out.println("10 equals to null: " + longValue.equals(null));

        //Compare
        System.out.println("True compare to false: " + Boolean.compare(true, false));
        System.out.println("10 compare to 5: " + Integer.compare(5, 10));
        System.out.println("3.14 compare to 3.14: " + Double.compare(3.14, 3.14));
        // Compare for all methods, except char, will return 0,1,-1
        System.out.println("A compare to a: " + Character.compare('A', 'a'));
        System.out.println("Z compare to A: " + Character.compare('Z', 'A'));
 
    

    }
}
