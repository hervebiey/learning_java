package com.imanuwel.threads;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultipleAnyCallableRunnner {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        List<CallableTask> tasks = List.of(
                new CallableTask("Imanuwel"),
                new CallableTask("Harvey"),
                new CallableTask("James")
        );

        String result = executorService.invokeAny(tasks);
        System.out.println(result);

        executorService.shutdown();
    }
}
