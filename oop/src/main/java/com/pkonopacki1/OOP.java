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
        // Object Inheritance and Casting
        Animal animal = new Horse(AnimalType.MAMMAL);

        // Below won't work, we can only use method related to the reference object
        // animal.getColour():

        Horse horse = (Horse) animal;
        horse.setColour("Brown");

        System.out.println(animal.getType());
        System.out.println(horse.getColour());
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
