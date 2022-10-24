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
        } else {
            System.out.println("Type is not a number");
        }
    }

    public static <T extends Number> void getNumberBound(T number) {
        System.out.println(number.intValue());
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
        var genericClass2 = new GenericClass<String>("hello");
        genericClass2.getNumber();

        GenericClass.getNumberBound(3.14);

        // Using generic method
        NonGenericWithGenericMethod nonGenericWithGenericMethod = new NonGenericWithGenericMethod();
        nonGenericWithGenericMethod.doSomething("Hello");
    }
}
