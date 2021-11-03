package com.konopackipio1;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class OOConcepts {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        Runnable task = (()-> {
            try {
                System.out.println("Runnable started");
                Thread.sleep(1000);
                System.out.println("Runnable finished");
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        });

        Callable<String> call = (()-> {
            try {
                System.out.println("Callable started");
                Thread.sleep(1000);
                System.out.println("Callable finished");
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            return "Callable is done";
        });

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Future<?> taskResult = executorService.submit(task);
        Future<?> callResult = executorService.submit(call);

        executorService.shutdownNow();

        // Get method on a future object, will block evaluating further code until thread  finishes
        // System.out.println(teskResult.get(250, TimeUnit.MILLISECONDS));
        System.out.println(taskResult.get());
        System.out.println(callResult);
        
        executorService.shutdown();



        // You can't submit more tasks after shuting down the executor
        // executorService.submit(call);
    }
}


class DoSomethingThread extends Thread {
    @Override
    public void run() {
        throw new RuntimeException();
    }
}
