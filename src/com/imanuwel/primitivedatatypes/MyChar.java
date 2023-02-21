package com.imanuwel.primitivedatatypes;

import java.util.Arrays;
import java.util.List;

public class MyChar {
    private final char ch;

    public MyChar(char ch) {
        this.ch = ch;
    }

    public static void printLowerCaseAlphabets() {
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.println(ch);
        }
    }

    public static void printUpperCaseAlphabets() {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println(ch);
        }
    }

    public boolean isAlphabet() {
        return (ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122);
    }

    public boolean isVowel() {
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        return vowels.contains(ch);
    }

    public boolean isConsonant() {
        return isAlphabet() && !isVowel();
    }

    public boolean isDigit() {
        return ch >= 48 && ch <= 57;
    }
}
