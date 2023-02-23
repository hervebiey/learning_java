package com.imanuwel.tips;

public enum Season {
    SPRING(4), SUMMER(1), WINTER(2), FALL(3);

    private final int value;

    Season(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}