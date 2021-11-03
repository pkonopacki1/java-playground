package com.konopackipio1.locks;

public class DeadLockExample {

    // This example shows that accessing synchronised method at the same time, will lock the threads. 
    // To avoid this, respnse should not be synchronised (synchronise locks access when it's used by an object)

    public static void main(String[] args) {
        Neighbour neighbour1 = new Neighbour("Tom");
        Neighbour neighbour2 = new Neighbour("John");
        
        Thread thread1 = new Thread(() -> neighbour1.greetNeigbhour(neighbour2));
        Thread thread2 = new Thread(() -> neighbour2.greetNeigbhour(neighbour1));

        thread1.start();
        thread2.start();
    }
    
}

class Neighbour {
    private String name;

    public Neighbour(String name) {
        this.name = name;
    }

    public synchronized void greetNeigbhour(Neighbour neighbour) {
        System.out.println("Hi " + neighbour.name + ", how are you?");

        neighbour.response(this);
    }

    public synchronized void response(Neighbour neighbour) {
        System.out.println("I'm good, " + neighbour.name + "! Thank you");
    }

}
