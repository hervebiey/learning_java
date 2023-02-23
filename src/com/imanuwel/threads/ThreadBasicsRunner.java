package com.imanuwel.threads;

class Task1 extends Thread {
    public void run() {
        // IntStream.range(101, 200).forEach(n -> System.out.print(n + " "));
        System.out.print("Task 1 Started \n");
        for (int i = 101; i <= 199; i++) {
            System.out.print(i + " ");
        }
        System.out.print("\nTask 1 Done \n");
    }
}

class Task2 implements Runnable {
    @Override
    public void run() {
        System.out.print("Task 2 Started \n");
        for (int i = 201; i <= 299; i++) {
            System.out.print(i + " ");
        }
        System.out.print("\nTask 2 Done \n");
    }
}

public class ThreadBasicsRunner {
    public static void main(String[] args) throws InterruptedException {
        // Task 1
        Task1 task1 = new Task1();
        task1.setPriority(1);
        task1.start();

        // Task 2
        Task2 task2 = new Task2();
        Thread task2Thread = new Thread(task2);
        task2Thread.setPriority(10);
        task2Thread.start();

        // Task 3
        task1.join();
        task2Thread.join();
        
        System.out.print("Task 3 Kicked In \n");
        for (int i = 301; i <= 399; i++) {
            System.out.print(i + " ");
        }

        System.out.print("\nTask 3 Done \n");

        System.out.print("\nMain Done");
    }
}
