package com.pkonopacki1.collections;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//--------------------------------------------------
// This example shows that passing an object implementing Comparator to a tree constructor,
// Passes the comparator, not an object

class Person implements Comparable<Person> {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        return age - o.age;
    }  

    @Override
    public String toString() {
        return name + ", age: " + age;
    }
}

class ComparablePerson extends Person implements Comparator<ComparablePerson> {

    public ComparablePerson(String name, int age) {
        super(name, age);
    }

    @Override
    public int compare(ComparablePerson o1, ComparablePerson o2) {
        return o2.age - o1.age;
    }
    
}

public class TreeSetOOOExample {

     public static void main(String[] args) {
        List<Person> initialData = List.of(
            new Person("Tomasz", 30),
            new Person("Cyprian", 25),
            new Person("Piotr", 27)
        );
    
        TreeSet<Person> setWithouComparator = new TreeSet<>();
        setWithouComparator.addAll(initialData);
        System.out.println("Tree set with an empty constructor will give us natural order: " + setWithouComparator);

        List<ComparablePerson> initialData2 = List.of(
            new ComparablePerson("Tomasz", 30),
            new ComparablePerson("Cyprian", 25),
            new ComparablePerson("Piotr", 27)
        );

        TreeSet<ComparablePerson> setWithComparator = new TreeSet<>(new ComparablePerson("whoever", 11));
        setWithComparator.addAll(initialData2);
        System.out.println("Tree set with comparator in a constructor will give us natural order: " + setWithComparator);
         
     }
    
}
