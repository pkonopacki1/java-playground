package com.konopackipio1.executorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        // Depending which type of executor we use, we get different result. SingleThread will wait for one thread to finish, cached thread will run in parallel
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        // ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(ExecutorServiceExample::methodOne);
        executorService.execute(ExecutorServiceExample::methodTwo);

        for(int i = 0; i < 10; i++) {
            System.out.println("Main thread iteration: " + i);
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        // shutdown will wait for all threads to stop, but won't allow new ones to start
        // shutdownNow will try to stop current thread execution
        //executorService.shutdown();
        executorService.shutdownNow();
        
    }
 
    private static void methodOne() {
        try {
            for(int i = 0; i < 5; i++) {
                Thread.sleep(250);
                System.out.println("Method one iteration: " + i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void methodTwo() {
        try {
            for(int i = 0; i < 10; i++) {
                Thread.sleep(250);
                System.out.println("Method two iteration: " + i);
            }
        } catch (InterruptedException e) {
            System.out.println("Method two interrupted");
        }
    }
}
