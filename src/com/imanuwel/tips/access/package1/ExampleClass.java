package com.imanuwel.tips.access.package1;

public class ExampleClass {
    public static void main(String[] args) {
    }

    public void publicMethod() {
    }

    protected void protectedMethod() {
    }

    private void privateMethod() {
    }

    void defaultMethod() {
        ExampleClass exampleClass = new ExampleClass();
        exampleClass.publicMethod();
        exampleClass.protectedMethod();
        exampleClass.privateMethod();
        exampleClass.defaultMethod();
    }
}
