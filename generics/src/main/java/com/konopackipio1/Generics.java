package com.konopackipio1;


//example of generic class
class GenericClass<T> {

    T type;

    public GenericClass(T type) {
        this.type = type;
    }

    public void getNumber() {
        if(type instanceof Number) {
            System.out.println("Type is a number");
        }
    }
}

// Methods can also be generic, even in a not generic class
class NonGenericWithGenericMethod {
    public <T> void doSomething(T t) {
        System.out.println(t.getClass());
    }
}

public class Generics 
{
    public static void main( String[] args )
    {
        GenericClass<Integer> genericClass = new GenericClass<>(Integer.valueOf(19));
        genericClass.getNumber();
        // Using generic method
        NonGenericWithGenericMethod nonGenericWithGenericMethod = new NonGenericWithGenericMethod();
        nonGenericWithGenericMethod.doSomething("Hello");
    }
}
