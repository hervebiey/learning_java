package com.imanuwel.newfeatures;

import java.util.List;

public class TypeInferencesRunner {
    public static void main(String[] args) {
        List<String> names1 = List.of("Harvey", "Roger");
        List<String> names2 = List.of("Sean", "Adam");

        final var names = List.of(names1, names2);
        names.stream().forEach(System.out::println);

        for (var name : names) {
            System.out.println(name);
        }

        var streamVar = List.of("Harvey", "Roer").stream().filter(s -> s.length() < 5);
        
        streamVar.forEach(System.out::println);
    }
}
