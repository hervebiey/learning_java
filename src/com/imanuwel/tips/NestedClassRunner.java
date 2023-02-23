package com.imanuwel.tips;

class DefaultClass {

}

public class NestedClassRunner {
    int i;

    public static void main(String[] args) {
        NestedClassRunner nestedClassRunner = new NestedClassRunner();
        InnerClass innerClass = nestedClassRunner.new InnerClass();

        StaticNestedClass staticNestedClass = new StaticNestedClass();
    }

    static class StaticNestedClass {
        public void method() {
//            i = 5;
        }
    }

    class InnerClass {
        public void method() {
            i = 5;
        }
    }
}
