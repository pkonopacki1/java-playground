package com.pkonopacki1.animals;

public abstract class Animal {
    AnimalType type;
    
    Animal (AnimalType type) {
        this.type = type;
    }

    public AnimalType getType() {
        return type;
    }
}
