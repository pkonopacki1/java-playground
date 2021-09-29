package com.pkonopacki1;

class Door implements AutoCloseable {

    @Override
    public void close() {
        System.out.println("Close the doors");        
    }

}

class Alarm implements AutoCloseable {

    @Override
    public void close() {
        System.out.println("Shut the alarm");        
    }

}

public class TryWithResources {
    public static void main(String[] args) {
        // Below code shows that any class that implement autoclosable can be used in try with resources
        try (Door door = new Door();
            Alarm alarm = new Alarm()) {

        }

        // Below code shows "extended try with resources", and it shows that resources are closed first
        try(Door door = new Door();
        Alarm alarm = new Alarm()) {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            System.out.println("Null pointer caught");
        } finally {
            System.out.println("Finally at the end");
        }
    

        

    }

}
