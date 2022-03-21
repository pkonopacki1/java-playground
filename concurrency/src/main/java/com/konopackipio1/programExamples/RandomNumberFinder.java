package com.konopackipio1.programExamples;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//--------------------------------------------
// This program tries to find given number, by searching random numbers. It's a useless program. Returns result object with loops and time

public class RandomNumberFinder {
    
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executorService = Executors.newCachedThreadPool();
        Callable<Result> callable = new RandomNumberFinderCallable(666);

        Future<Result> futureResult = executorService.submit(callable);

        while(!futureResult.isDone());

        Result result = futureResult.get();

        System.out.println("Loop: " + result.getLoops());
        System.out.println("Time: " + result.getTime());

        executorService.shutdown();     
    }
    
    
}

class RandomNumberFinderCallable implements Callable<Result> {
    private final int searchedNumber;
    Result result = new Result();
    Random random = new Random();

    public RandomNumberFinderCallable(int searchedNumber) {
        this.searchedNumber = searchedNumber;
    }

    @Override
    public Result call() throws Exception {
        long startTime = System.currentTimeMillis();

        while(random.nextInt(searchedNumber + 1) != searchedNumber) {
            result.incrementLoops();
            Thread.sleep(100);
        }
        
        result.setTime(System.currentTimeMillis() - startTime);
                
        return result;
    }

}


class Result {
    private long loops;
    private long time;

    public long getLoops() {
        return loops;
    }
    public void incrementLoops() {
        loops++;
    }
    public long getTime() {
        return time;
    }
    public void setTime(long time) {
        this.time = time;
    }

    
}
