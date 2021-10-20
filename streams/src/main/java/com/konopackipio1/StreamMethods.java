package com.konopackipio1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }   
    
    @Override
    public String toString() {
        return name;
    }

}

public class StreamMethods {
    public static void main(String[] args) {
        // peek
        Consumer<Person> modifyName = p -> { 
            p.setName("mr " + p.getName());
            System.out.println("peek: " + p.getName());  
        };
        List<Person> list = new ArrayList<>(List.of(new Person("Piotr"), new Person("Cyprian"), new Person("Tomasz")));
        List<Person> list2 = list.stream()
            .peek(modifyName)
            .collect(Collectors.toList());
        System.out.println(list2);
        
    }
    
}
