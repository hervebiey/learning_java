package com.imanuwel.exceptionhandling;

import java.math.BigDecimal;

class Test implements Comparable<String> {
    @Override
    public int compareTo(String o) {
        return 0;
    }
}

public class TipsAndTricks {
    public static void main(String[] args) throws InterruptedException {

        DummyForTest dt = new DummyForTest();
        dt.doSomething();

        BigDecimal bd = new BigDecimal(Integer.valueOf(5));
        Thread.sleep(1000);
    }
}
