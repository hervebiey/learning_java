package com.imanuwel.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithLock {
    Lock lockForI = new ReentrantLock();
    Lock lockForJ = new ReentrantLock();
    private int i = 0;
    private int j = 0;

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

    public void incrementI() {
        lockForI.lock(); // Get Lock for I
        i++;
        lockForI.unlock(); // Release Lock for I
    }

    public void incrementJ() {
        lockForJ.lock(); // Get Lock for J
        j++;
        lockForJ.unlock(); // Release Lock for J
    }
}
