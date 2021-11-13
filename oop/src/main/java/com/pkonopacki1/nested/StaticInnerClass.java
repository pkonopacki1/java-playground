package com.pkonopacki1.nested;


class OuterNestedClass {
    static class NestedStatic {
        private void doSomethingFromNested() {
            System.out.println("Hello from static class");
        }
    }

    public void useNested() {
        new NestedStatic().doSomethingFromNested();
    }
}

public class StaticInnerClass {
    public static void main(String[] args) {
        new OuterNestedClass().useNested();
    }
    
}
