package com.imanuwel.oops;

public class MotorBike {
    private int speed; //member variable

    public MotorBike(int speed) {
        this.speed = speed;
    }

    public MotorBike() {
        this(5);
    }

    void start() {
        System.out.println("Bike started.");
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed > 0) {
            this.speed = speed; //local variable
        }
    }

    public void increaseSpeed(int amount) {
        setSpeed(this.speed + amount);
    }

    public void decreaseSpeed(int amount) {
        setSpeed(this.speed - amount);
    }
}
