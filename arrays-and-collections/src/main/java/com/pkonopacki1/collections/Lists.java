package com.pkonopacki1.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lists {
    // Regular declaration
    ArrayList<Integer> arrayList = new ArrayList<>();
    // Declaration with initial size
    ArrayList<Integer> arrayList2 = new ArrayList<>(10);
    // Declaration with element
    static ArrayList<Integer> arrayList3 = new ArrayList<>(List.of(1, 5, 6, 7, 8));

    public static void main(String[] args) {
        System.out.println("Initial array: " + arrayList3);
        // Adding many element at specific index
        arrayList3.addAll(1, List.of(2, 3, 4));
        System.out.println("Array after using add all:" + arrayList3);

        // Multiplyig all element with replace all
        arrayList3.replaceAll((i) -> i * 2);
        System.out.println("Array after using replace all: " + arrayList3);

        // Index of a non existing element
        System.out.println("Index of 123: " + arrayList3.indexOf(123));

        // Belowe example shows how manipluating sublist also affects list
        System.out.println("-----SUBLIST-----");
        System.out.println("List before manipulation: " + arrayList3);
        List subList = arrayList3.subList(2, 6);
        System.out.println("Sublist before sorting: " + subList);
        subList.sort(Comparator.reverseOrder());
        System.out.println("Sublist after sorting: " + subList);
        System.out.println("List after manipulation: " + arrayList3);

    }
}
