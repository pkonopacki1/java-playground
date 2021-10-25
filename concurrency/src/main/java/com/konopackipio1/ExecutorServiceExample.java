package com.konopackipio1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        // In this example you can notice that because we run single thread, method two will start only after method one
        // finishes
        ExecutorService executorService = Executors.newSingleThreadExecutor();
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

        executorService.shutdown();
        
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
            for(int i = 0; i < 5; i++) {
                Thread.sleep(250);
                System.out.println("Method two iteration: " + i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
