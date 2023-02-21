package com.imanuwel.oops;

public class Address {
    private final String line1;
    private final String city;
    private final String zip;

    public Address(String line1, String city, String zip) {
        super();
        this.line1 = line1;
        this.city = city;
        this.zip = zip;
    }

    public String toString() {
        return line1 + ", " + zip + " " + city;
    }
}
