package com.imanuwel.generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericsRunner {

    static <X> X doubleValue(X value) {
        return value;
    }

    static <X extends List> void duplicate(X list) {
        list.addAll(list);
    }

    static double sumOfNumberList(List<? extends Number> numbers) {
        double sum = 0.0;
        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }

    static void addACoupleOfValues(List<? super Number> numbers) {
        numbers.add(1);
        numbers.add(1.0);
        numbers.add(1.0f);
        numbers.add(1L);
    }

    public static void main(String[] args) {

        String value1 = doubleValue("");
        Integer number1 = doubleValue(Integer.valueOf(5));
        List arrayList = doubleValue(new ArrayList<>());

        LinkedList<Integer> numbers = new LinkedList<>(List.of(1, 2, 3));
        duplicate(numbers);
        System.out.println(numbers);

        System.out.println(sumOfNumberList(List.of(1, 2, 3, 4, 5)));
        System.out.println(sumOfNumberList(List.of(1.1, 2.1, 3.1, 4.1, 5.1)));
        System.out.println(sumOfNumberList(List.of(1L, 2L, 3L, 4L, 5L)));

        List emptyList = new ArrayList<Number>();
        addACoupleOfValues(emptyList);
        System.out.println(emptyList);

        MyCustomList<Long> list = new MyCustomList<>();
        list.addElement(5L);
        list.addElement(7L);
        Long value = list.get(0);

        System.out.println(value);

        MyCustomList<Integer> list2 = new MyCustomList<>();
        list2.addElement(Integer.valueOf(5));
        list2.addElement(Integer.valueOf(7));
        Integer number = list2.get(0);

        System.out.println(number);
    }
}