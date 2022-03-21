package com.konopackipio1.executorService;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceSubmitExample {
    
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        // Using submit() method:
        // 1. With Runnable object and return object as a second parameter
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

        // 2. With Callable object
        CallableClass callableClass = new CallableClass(10);
        Future<Integer> callableResult = executorService.submit(callableClass);

        System.out.println("Callable result: " + callableResult.get());

        executorService.shutdown();
        
    }   
}

class CallableClass implements Callable<Integer> {

    final int bound;

    public CallableClass(int bound) {
        this.bound = bound;
    }

    @Override
    public Integer call() throws Exception {

        Random r = new Random();
        
        return r.nextInt(bound);
    }

}
