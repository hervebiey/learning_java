package com.imanuwel.tips;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class LengthComparator implements Comparator<String> {
    @Override
    public int compare(String str1, String str2) {
        return Integer.compare(str1.length(), str2.length());
    }
}

public class AnonymousClassRunner {
    static Comparator<String> lengthComparator = new Comparator<String>() {
        @Override
        public int compare(String str1, String str2) {
            return Integer.compare(str1.length(), str2.length());
        }
    };

    public static void main(String[] args) {
        List<String> animals = new ArrayList<>(List.of("Cat", "Ant", "Ball", "Elephant"));

        Collections.sort(animals, lengthComparator);
        System.out.println(animals);
    }
}
