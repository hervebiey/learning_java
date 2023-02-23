package com.imanuwel.exceptionhandling;

public class CheckedExceptionRunner {
    public static void main(String[] args) {
        /*try {
            someOtherMethod();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/
        someOtherMethod2();
    }

    private static void someOtherMethod() throws InterruptedException {
        Thread.sleep(2000);
    }

    private static void someOtherMethod2() throws RuntimeException {

    }
}
