package com.pkonopacki1.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AsListAndListOfMethods {
    public static void main(String[] args) {
        createAsList();
        createListof();
    }

    private static void createAsList() {
        List<String> list = Arrays.asList("abc", "def");
        System.out.println("List created with asList method before manipulation: " + list);
        try {
            list.add("new string"); // this will return RunTimeException, returned list
        } catch (Exception e) {
            System.err.println("Error, trying to change size of fixed size list: " + e);
        }
        // has umodifiable size
        list.set(0, "new string"); // This works fine, we still can modify elements
        System.out.println("List created with asList method after manipulation: " + list);
    }

    private static void createListof() {
        try {
            List<String> list2 = List.of("abc", "def");
            list2.set(0, "new string"); // This will throw an java.lang.UnsupportedOperationException, this list is
                                        // umodifiable
        } catch (Exception e) {
            System.err.println("Error, trying to modify unmodifiable list: " + e);
        }

        // List.of allows making List of element but does not allow null
        try {
            ArrayList<Integer> arrayList = new ArrayList<>(List.of(1, 2, 3, null));
        } catch (Exception e) {
            System.out.println("Adding null to a List.of method: " + e);
        }
    }

}
