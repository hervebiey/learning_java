package com.imanuwel.loops;

public class MyNumberRunner {
    public static void main(String[] args) {
        MyNumber number = new MyNumber(5);

        boolean isPrime = number.isPrime();
        System.out.println("Is this a prime number? " + isPrime);

        int sum = number.sumUptoN();
        System.out.println("The sum of numbers to N: " + sum);

        int sumOfDivisors = number.sumOfDivisors();
        System.out.println("The sum of divisors: " + sumOfDivisors);

        number.printNumberTriangle();
    }
}
