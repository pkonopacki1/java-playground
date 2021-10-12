package com.pkonopacki1.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;


//----------------------------------------
// Collections class contains some useful static methods


public class CollectionsClassMethods {
    
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(10,30,15,45,50));
        System.out.println("Initial list: " + list);

        Collections.swap(list, 0, list.size() - 1);
        System.out.println("List after swapping first and last element: " + list);

        Collections.shuffle(list);
        System.out.println("List after shuffling: " + list);

        System.out.println("Collections min value: " + Collections.min(list));
        System.out.println("Collections max value: " + Collections.max(list));

        Collections.fill(list, 123);
        System.out.println("List after filling data: " + list);

        Set<Integer> singleTone = Collections.singleton(list.get(0));
        System.out.println("Singleton set from list: " + singleTone);

        // singleTone.add(5); // Singletone is unmodifiable

        List list2 = new ArrayList<>(singleTone);
        List list3 = new ArrayList<>(List.of(1,2));
        try {
            Collections.copy(list2, list3);
        } catch (Exception e) {
            System.out.println("Can't copy to smaller list: " + e);
        }

        // Note that below list is immutable
        System.out.println("N copies of elements: " + Collections.nCopies(5, null));
        
    }
    
}
