package com.pkonopacki1;

public class CastingClass {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        // Below won't compile, wrong casting
        // Dog dog = (Animal) new Dog();

        Dog puppy = new Dog();
        Puppy puppy2 = (Puppy) new Dog();

        //This is a class cast exception ona runtime
        // Dog dog = (Dog) animal1;

        
    }
}

class Animal {
    public void getName() {
        System.out.println("Unkown");
    }
}

class Dog extends Animal implements Puppy {
    public void getName() {
        System.out.println("Dog");
    }
}

interface Puppy {

}
