package com.imanuwel.collections;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {
    public static void main(String[] args) {
        String str = "This is an awesome occasion. "
                + "This has never happened before.";

        Map<Character, Integer> occurrences = new HashMap<>();

        char[] characters = str.toCharArray();

        for (char character : characters) {
            Integer integer = occurrences.get(character);
            if (integer == null) {
                occurrences.put(character, 1);
            } else {
                occurrences.put(character, integer + 1);
            }
        }
        System.out.println(occurrences);


        Map<String, Integer> stringOccurrences = new HashMap<>();
        String[] words = str.split(" ");

        for (String word : words) {
            Integer integer = stringOccurrences.get(word);
            if (integer == null) {
                stringOccurrences.put(word, 1);
            } else {
                stringOccurrences.put(word, integer + 1);
            }
        }
        System.out.println(stringOccurrences);
    }
}
