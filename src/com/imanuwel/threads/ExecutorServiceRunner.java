package com.imanuwel.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread {

    private final int number;

    public Task(int number) {
        this.number = number;
    }

    public void run() {
        // IntStream.range(101, 200).forEach(n -> System.out.print(n + " "));
        System.out.print("Task " + number + " Started \n");

        for (int i = number * 100; i <= number * 100 + 99; i++) {
            System.out.print(i + " ");
        }

        System.out.print("\nTask " + number + " Done \n");
    }
}

public class ExecutorServiceRunner {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        executorService.execute(new Task(1));
        executorService.execute(new Task(2));
        executorService.execute(new Task(3));
        executorService.execute(new Task(4));
        executorService.execute(new Task(5));
        executorService.execute(new Task(6));
        executorService.execute(new Task(7));

        executorService.shutdown();
    }
}
