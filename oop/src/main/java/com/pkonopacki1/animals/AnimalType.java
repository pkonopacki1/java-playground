package com.pkonopacki1.animals;

public enum AnimalType {
    MAMMAL("Mammal");

    private String type;

    private AnimalType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }
    
}
