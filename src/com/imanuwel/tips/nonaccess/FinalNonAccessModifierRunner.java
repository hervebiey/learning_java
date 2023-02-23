package com.imanuwel.tips.nonaccess;

final class FinalClass {
}

/*class SomeClass extends FinalClass {
}*/

class SomeClass {
    final public void doSomething() {
    }

    public void doSomethignElse(final int arg) {
//        arg = 6;
    }
}

class ExtendingClass extends SomeClass {
    /*public void doSomething() {
    }*/
}

public class FinalNonAccessModifierRunner {
    public static void main(String[] args) {
        final int i;
        i = 5;
//        i = 7;
    }
}
