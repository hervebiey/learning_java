package com.imanuwel.tips;

import java.util.Arrays;

public class EnumRunner {
    Season season;

    public static void main(String[] args) {
        Season season = Season.FALL;

        Season season1 = Season.valueOf("WINTER");
        System.out.println(season1);
        System.out.println(Season.SPRING.ordinal());
        System.out.println(Season.SPRING.getValue());

        System.out.println(Arrays.toString(Season.values()));
    }
}
