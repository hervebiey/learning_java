package com.imanuwel.oops;

public class StudentRunner {
    public static void main(String[] args) {
        /*Student student = new Student();
        student.setName("Harvey");
        student.setEmail("harvey@gmail.com");*/

        /*Person person = new Person();
        person.setName("Harvey");
        person.setEmail("harvey@gmail.com");
        person.setPhoneNumber("0473 28 82 33");
        String value = person.toString();
        System.out.println(value);
        System.out.println(person);*/

        Employee employee = new Employee("Harvey", "Programmer Analyst");
        employee.setEmail("harvey@gmail.com");
        employee.setPhoneNumber("0473 28 82 33");
        employee.setEmployeeGrade('A');
        employee.setTitle("Programmer Analyst");

        System.out.println(employee);
    }
}
