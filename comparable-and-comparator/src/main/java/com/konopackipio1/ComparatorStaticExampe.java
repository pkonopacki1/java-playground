package com.konopackipio1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// This example shows how to use comparing to use exisiting methods for comparison

class Person {
    private String name;
    private String lastName;

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }   

    @Override
    public String toString() {
        return name + " " + lastName;
    }

}

public class ComparatorStaticExampe {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(List.of(
            new Person("Adam", "Smith"),
            new Person("John", "Kowalski"),
            new Person("Adam", "Kowalski")
        ));

        System.out.println(people);
        people.sort(Comparator.comparing(Person::getLastName).thenComparing(Person::getName));
        System.out.println(people);            
    }
    
}
