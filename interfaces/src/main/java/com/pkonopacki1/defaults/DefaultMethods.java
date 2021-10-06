package com.pkonopacki1.defaults;

interface Defaultable {
    void abstractMethod();
    default void defaultMethod() {
        System.out.println("Testing default method");
    }

    // void abstractAnotherMethod();

}

// This class implements interface with method with the same signature as parent class, 
// belowe main shows that Parent method will be executed
class DefaultClass extends ParentDefaultClass implements Defaultable{

    @Override
    public void abstractMethod() {
        System.out.println("Testing abstract method");        
    }

}

class ParentDefaultClass {
    public void defaultMethod() {
        System.out.println("Testing default method from class");
    }
}

public class DefaultMethods {
    public static void main(String[] args) {
        new DefaultClass().defaultMethod();
        // Uncomment abstractAnotherMethod();
        // This one does not compile as long as interface has another abstract method
        // This shows how default methods are useful, they can be used but don't break functional interface
        runDefaultmethod(() -> System.out.println("Testing interface"));
        
    }

    public static void runDefaultmethod(Defaultable defaultable) {
        defaultable.abstractMethod();
    }


    
}
