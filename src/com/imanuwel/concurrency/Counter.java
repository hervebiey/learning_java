package com.imanuwel.concurrency;

public class Counter {
    private int i = 0;

    synchronized public int getI() {
        return i;
    }

    public void increment() {
        i++;
    }
}
