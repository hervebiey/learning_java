package com.imanuwel.oops;

interface Flyable {
    void fly();
}

public class FlyableRunner {
    static void main(String[] args) {
        Flyable[] flyingObjects = {new Bird(), new Aeroplane()};
        for (Flyable object : flyingObjects) {
            object.fly();
        }
    }
}

class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("with wings");
    }
}

class Aeroplane implements Flyable {
    @Override
    public void fly() {
        System.out.println("with fuel");
    }
}
