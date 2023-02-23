package com.imanuwel.concurrency;

public class BiCounter {
    private int i = 0;
    private int j = 0;

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

    synchronized public void incrementI() {
        i++;
    }

    synchronized public void incrementJ() {
        j++;
    }
}
