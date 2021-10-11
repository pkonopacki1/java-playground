package com.konopackipio1;

import java.util.TreeSet;


// This example shows how comparable introduces natural order.
// Using treeSet (which uses natural ordering), set is ordered without using sort method

class QuickAnimal implements Comparable<QuickAnimal>{

    String name;
    private int speed;

    QuickAnimal(AnimalTypes animalType) {
        this.name = animalType.name;
        this.speed = animalType.speed;
    }

    @Override
    public int compareTo(QuickAnimal o) {
        return speed - o.speed;
    }

    @Override
    public String toString() {
        return name + ", speed: " + speed;
    }

}

enum AnimalTypes {
    TURTLE("Turtle", 1),
    DOG("Dog", 5),
    SNAIL("Snail", 0),
    TIGER("Tiger", 10);

    String name;
    int speed;

    AnimalTypes(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }
}


public class ComparableExample {
    public static void main(String[] args) {
        TreeSet<QuickAnimal> animalMap = new TreeSet<>();

        animalMap.add(new QuickAnimal(AnimalTypes.DOG));
        animalMap.add(new QuickAnimal(AnimalTypes.TURTLE));
        animalMap.add(new QuickAnimal(AnimalTypes.TIGER));
        animalMap.add(new QuickAnimal(AnimalTypes.SNAIL));

        System.out.println(animalMap);
        
    }
}

