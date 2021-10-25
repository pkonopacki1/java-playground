package com.konopackipio1;

// One way is to create a class that extends Thread
class ExampleThread extends Thread {

    @Override
    public void run() {
        try {
            while(!isInterrupted()) {
                sleep(1000);
                System.out.println("Thread woke up");
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }

}

// The other way is to create a class that implements Runnable
class ImplementingRunnable implements Runnable {

    @Override
    public void run() {
        try {
            while(!Thread.interrupted()) {
                Thread.sleep(1000);
                System.out.println("Runnable thread woke up");
            }
        } catch (InterruptedException e) {
            System.out.println("Runnable thread interrupted");
        }
        
    }
    
}

public class RunningThread {

    public static void main(String[] args) throws InterruptedException {
        ExampleThread exampleThread = new ExampleThread();
        Thread runnablThread = new Thread(new ImplementingRunnable());
        exampleThread.start();
        Thread.sleep(100);
        runnablThread.start();
        Thread.sleep(3000);
        exampleThread.interrupt();
        runnablThread.interrupt();
    }

    
}
