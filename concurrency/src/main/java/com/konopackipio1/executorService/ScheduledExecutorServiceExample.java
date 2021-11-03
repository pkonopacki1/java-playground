package com.konopackipio1.executorService;

import java.util.IntSummaryStatistics;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

// This example shows how we can schedule task with executorservice

public class ScheduledExecutorServiceExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Callable c1 = () -> ScheduledExecutorServiceExample.doSomething(3, 15);
        Callable c2 = () -> ScheduledExecutorServiceExample.doSomething(5, 15);

        ScheduledFuture result1 = null;
        ScheduledFuture result2 = null;

        ScheduledExecutorService scheduledExecutorService = null;

        scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();

        result1 = scheduledExecutorService.schedule(c1, 3, TimeUnit.SECONDS);
        System.out.println("Task should start in " + result1.getDelay(TimeUnit.SECONDS) + " seconds");

        result2 = scheduledExecutorService.schedule(c2, 4, TimeUnit.SECONDS);
        System.out.println("Task should start in " + result2.getDelay(TimeUnit.SECONDS) + " seconds");

        if(scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();

            scheduledExecutorService.awaitTermination(4, TimeUnit.SECONDS);

            if(result1.isDone()) {
                System.out.println(result1.get());
            }
            if(result2.isDone()) {
                System.out.println(result2.get());
            }
        }
        
    
    }

    private static IntSummaryStatistics doSomething(int seed, int maxNumber) {
        return Stream.iterate(seed, s -> s <= maxNumber, s -> s + seed)
                        .mapToInt(s -> s)
                        .peek((s) -> {
                            System.out.println("Seed: " + seed + ", s: " + s);
                        })
                        .summaryStatistics();
    }
    
}
