package com.imanuwel.newfeatures;

public class RecordsRunner {

    public static void main(String[] args) {
        Person person = new Person("Harvey", "harvey@gmail.com", "0473 27 39 23");
//        Person person1 = new Person("Harvey", "harvey@gmail.com", "0473 27 39 23");
//        Person person2 = new Person("Harvay", "harvey@gmail.com", "0473 27 39 23");
//
//        System.out.println(person.equals(person1));
//        System.out.println(person.equals(person2));

        System.out.println(person.name());
    }

    record Person(String name, String email, String phoneNumber) {
        /*Person(String name, String email, String phoneNumber) {
            if (name == null) {
                throw new IllegalArgumentException("Name is null");
            }
            this.name = name;
            this.email = email;
            this.phoneNumber = phoneNumber;
        }*/

        Person {
            if (name == null) {
                throw new IllegalArgumentException("Name is null");
            }
        }

        @Override
        public String name() {
            System.out.println("Do Something");
            return name;
        }
    }
}
