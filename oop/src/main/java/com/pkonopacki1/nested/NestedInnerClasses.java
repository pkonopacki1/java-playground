package com.pkonopacki1.nested;

class OuterClass{
    private final String outerClassName = "OuterClass";

    public void outerClassDoSomething() {
        System.out.println("Outer class do something");
    }

    class InnerClass{
        public void innerClassDoSomething() {
            System.out.println("Inner class");
        }

        public void getOuterClassField() {
            System.out.println(outerClassName);
        }
    }
}

public class NestedInnerClasses {
    public static void main(String[] args) {
        //Below code shows that inner classes can't be accessed directly
        OuterClass oc = new OuterClass();
        OuterClass.InnerClass ic = oc.new InnerClass(); // Take attention at this construct

        ic.innerClassDoSomething();
        ic.getOuterClassField();
    }   

    
    
}
