package com.imanuwel.newfeatures;

import java.util.ArrayList;
import java.util.List;

public class CopyOfApiRunner {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Harvey");
        names.add("Roger");
        names.add("James");

        List<String> copyOfNames = List.copyOf(names);

        doNotChange(copyOfNames);
        System.out.println(copyOfNames);
    }

    private static void doNotChange(List<String> names) {
        names.add("ShouldNotBeAllowed");
    }
}
