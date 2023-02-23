package com.imanuwel.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class BiCounterWithAtomicInteger {
    private final AtomicInteger i = new AtomicInteger();
    private final AtomicInteger j = new AtomicInteger();

    public AtomicInteger getI() {
        return i;
    }

    public AtomicInteger getJ() {
        return j;
    }

    public void incrementI() {
        i.incrementAndGet();
    }

    public void incrementJ() {
        j.incrementAndGet();
    }
}
