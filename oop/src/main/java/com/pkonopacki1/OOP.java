package com.pkonopacki1;

import com.pkonopacki1.animals.Animal;
import com.pkonopacki1.animals.AnimalType;
import com.pkonopacki1.animals.Horse;

/**
 * Hello world!
 *
 */
public class OOP 
{
    int a;

    OOP(int a) {
        this.a = a;
    }
    public static void main( String[] args )
    {
        Animal animal = new Horse(AnimalType.MAMMAL);

        System.out.println(animal.getType());
    }

    public static int doublePrimitiveData(int x) {
        return x*2;
    }

    public void doubleObjectParameter(OOP oop) {
        oop.a *= 2;
    }

    public static void nullObject(Object obj) {
        obj = null;
    }


}
