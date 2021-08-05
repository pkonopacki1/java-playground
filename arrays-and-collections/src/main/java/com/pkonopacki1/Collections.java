package com.pkonopacki1;

import java.util.ArrayList;
import java.util.List;

public class Collections {
    // Regular declaration
    ArrayList<Integer> arrayList = new ArrayList<>();    
    // Declaration with initial size
    ArrayList<Integer> arrayList2 = new ArrayList<>(10);
    // Declaration with element
    static ArrayList<Integer> arrayList3 = new ArrayList<>(List.of(1,5,6,7,8));

    public static void main(String[] args) {
        System.out.println("Initial array: " + arrayList3);
        // Adding many element at specific index
        arrayList3.addAll(1, List.of(2,3,4));
        System.out.println("Array after using add all:" + arrayList3);

        // Multiplyig all element with replace all
        arrayList3.replaceAll((i) -> i*2);
        System.out.println("Array after using replace all: " + arrayList3);
    }
}
