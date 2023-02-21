package com.imanuwel.loops;

public class WhileNumberPlayer {
    private final int limit;

    public WhileNumberPlayer(int limit) {
        this.limit = limit;
    }

    public void printSquaresUptoLimit() {
        int number = 1;
        while (number * number <= limit) {
            System.out.print(number * number + " ");
            number++;
        }
        System.out.println();
    }

    public void printCubesUptoLimit() {
        int number = 1;
        while (number * number * number <= limit) {
            System.out.print(number * number * number + " ");
            number++;
        }
        System.out.println();
    }
}
