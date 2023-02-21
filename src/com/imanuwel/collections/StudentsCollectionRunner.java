package com.imanuwel.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class AscendingStudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return Integer.compare(student1.getId(), student2.getId());
    }
}

public class StudentsCollectionRunner {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student(1, "Harvey"),
                new Student(100, "Alex"),
                new Student(2, "Eve")
        );
        List<Student> studentsAl = new ArrayList<>(students);

        System.out.println(studentsAl);

        Collections.sort(studentsAl);
        System.out.println("Desc: " + studentsAl);

        Collections.sort(studentsAl, new AscendingStudentComparator());
        System.out.println("Asc1: " + studentsAl);

        studentsAl.sort(new AscendingStudentComparator());
        System.out.println("Asc2: " + studentsAl);
    }
}