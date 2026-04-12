package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyTask implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        IO.println("Task running in thread " + Thread.currentThread().getName());
        Thread.sleep(4000);
        return 100;
    }

}

public class ThreadCallableEx {

    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<MyTask> tasks = Arrays.asList(new MyTask(), new MyTask(), new MyTask());

        List<Future<Integer>> futures = executor.invokeAll(tasks);

        for(Future<Integer> future: futures){
            IO.println("Result from Callable - " + future.get());
        }

        executor.shutdown();



    }
}