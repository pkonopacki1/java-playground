package com.konopackipio1;

import java.util.ArrayList;
import java.util.List;

class WildCardClass<T> {

}

public class WildCards {
    // Example of field declaration with upper bound
    WildCardClass<? extends Integer> wildCardClass;

    // Example of static field declaration with lower bound
    static WildCardClass<? super Integer> wildCardClass2;

    // Example of delaring a method with a wildcard
    public static void method(List<?> t) {
        System.out.println(t);

    }


    
    public static void main(String[] args) {
        WildCards wildCards = new WildCards();
        List<Integer> list = new ArrayList<Integer>(List.of(1,2,3));        

        // Valid usages
        wildCards.method(list);
        // Invalid usgaes
        // wildCards.<? extends List>method(list);

        // Won't compile because compiler won't know which class should add
        List<? extends String> list1 = new ArrayList<>(List.of("abc", "def"));
        // list1.add("ghi");
    }
    
}
