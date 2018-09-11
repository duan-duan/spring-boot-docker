package com.harry.docker.demo;

import java.util.concurrent.*;

public class CallableDemo implements Callable<String> {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newCachedThreadPool();
        CallableDemo callableDemo = new CallableDemo();
        Future<String> future = executorService.submit(callableDemo);
        System.out.println("123");
        System.out.println(future.get());//阻塞
        System.out.println("1234");
        executorService.shutdown();

    }



    @Override
    public String call() throws Exception {
        return "String"+1;
    }

}
