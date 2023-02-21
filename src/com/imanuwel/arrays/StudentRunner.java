package com.imanuwel.arrays;

import java.math.BigDecimal;

public class StudentRunner {
    public static void main(String[] args) {
        Student student = new Student("Harvey", 97, 98, 100);
        Student student2 = new Student("James", 97, 98);
        Student student3 = new Student("Yves", 97, 98, 90, 98);

        int number = student.getNumberOfMarks();
        System.out.println("Number of marks: " + number);

        int sum = student.getTotalSumOfMarks();
        System.out.println("Sum of marks: " + sum);

        int maximumMark = student.getMaximumMark();
        System.out.println("Maximum mark: " + maximumMark);

        int minimumMark = student.getMinimumMark();
        System.out.println("Minimum mark: " + minimumMark);

        BigDecimal average = student.getAverageMarks();
        System.out.println("Average marks: " + average);

        System.out.println(student);

        student.addNewMark(94);
        System.out.println(student);

        student.removeMarkAtIndex(1);
        System.out.println(student);
    }
}
