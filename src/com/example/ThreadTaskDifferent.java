package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


class Task1 implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        IO.println("Thread - " + Thread.currentThread().getName());
        Thread.sleep(2000);
        return 100;
    }
}

class Task2 implements Callable<String> {

    @Override
    public String call() throws Exception {
        IO.println("Thread - " + Thread.currentThread().getName());
        Thread.sleep(4000);
        return "Task2 executed by the thread - " + Thread.currentThread().getName();
    }
}

class Task3 implements Callable<Boolean> {

    @Override
    public Boolean call() throws Exception {
        IO.println("Thread - " + Thread.currentThread().getName());
        Thread.sleep(5000);
        return Thread.currentThread().getName().contains("1");
    }
}

public class ThreadTaskDifferent {
    public static void main(String[] args) throws Exception{
        ExecutorService executor = Executors.newFixedThreadPool(3);

        Future<Integer> future1 = executor.submit(new Task1());
        Future<String> future2 = executor.submit(new Task2());
        Future<Boolean> future3 = executor.submit(new Task3());

        IO.println("Result 1 - " + future1.get());
        IO.println("Result 2 - " + future2.get());
        IO.println("Result 3 - " + future3.get());

        executor.shutdown();

    }



}
