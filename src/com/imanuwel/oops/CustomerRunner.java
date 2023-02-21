package com.imanuwel.oops;

public class CustomerRunner {
    public static void main(String[] args) {
        Address homeAddress = new Address("Lauwstraat 15", "Sint-Denijs-Westrem", "9051");
        Customer customer = new Customer("Harvey", homeAddress);

        Address workAddress = new Address("Kortrijksesteenweg 1111", "Sint-Denijs-Westrem", "9051");
        customer.setWorkAddress(workAddress);

        System.out.println(customer);
    }
}
