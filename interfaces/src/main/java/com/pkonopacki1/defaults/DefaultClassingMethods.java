package com.pkonopacki1.defaults;

interface Walkable {
    void walk();

    default String getSpeed() {
        return "5km/h";
    }
}

interface Runnable {
    void run();

    default String getSpeed() {
        return "10km/h";
    }
}

class Move implements Walkable, Runnable {

    @Override
    public void run() {
        // Below shows how to force using implemented interface default method 
        System.out.println("Running at a speed of: " + Runnable.super.getSpeed());
    }

    @Override
    public void walk() {
        System.out.println("Walking at a speed of: " + Walkable.super.getSpeed());
        
    }

    // Because this method impelemtns unrelated interfaces with same signature, we need to compoile it to avoid 
    // compile error
    @Override
    public String getSpeed() {
        return "0km/h";
    }

}

public class DefaultClassingMethods {
    public static void main(String[] args) {
        Move move = new Move();
        move.run();
        move.walk();
    }
    
}
