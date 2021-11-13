package com.pkonopacki1.nested;

import com.pkonopacki1.nested.OuterClass.InnerClass;

class OuterClass{
    private String outerClassName = "OuterClass";
    private int x = 5;

    public static void outerClassDoSomething() {
        System.out.println("Outer class do something");    
        System.out.println("Accessing inner class member: " + new OuterClass().new InnerClass().y);    
    }

    class InnerClass{
        private int x = 10;
        private int y = 15;

        // Inner class can call outer class methods
        public void innerClassDoSomething() {
            outerClassDoSomething();
            System.out.println("Inner class");
        }

        // Inner class can access all outer class fields
        public void getOuterClassField() {
            System.out.println(outerClassName);
            System.out.println("Accessing outer class variable with same name: " + OuterClass.this.x);
        }
    }
}

public class NestedInnerClasses {
    public static void main(String[] args) {
        //Below code shows that inner classes can't be accessed directly
        OuterClass oc = new OuterClass();

        // Possible inner class declarations
        OuterClass.InnerClass ic = oc.new InnerClass();
        InnerClass ic2 = oc.new InnerClass();

        ic.innerClassDoSomething();
        ic.getOuterClassField();
    }   

    
    
}
