package com.pkonopacki1.animals;

public class Horse extends Animal{

    private String colour;

    public Horse(AnimalType type) {
        super(type);
    }

    public Horse(AnimalType type, String colour) {
        super(type);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    
}
