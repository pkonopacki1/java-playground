package com.konopackipio1.executorService;

import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceSubmitExample {
    
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // Payatention to ExecutorService factory method
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        // When we use 'submit' method, it returns a Future object, it will return the second parameter of submit method
        // after it's done
        Future returnSubmit = executorService.submit(
            () -> new Random()
                    .ints(0, 100)
                    .limit(5)
                    .forEach(System.out::println)
        , "Thread finished");

        while(!returnSubmit.isDone()) {
            Thread.sleep(250);
        }

        System.out.println(returnSubmit.get());

        
    }
    
}
