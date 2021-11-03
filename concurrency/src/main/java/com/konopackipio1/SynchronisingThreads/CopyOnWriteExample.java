package com.konopackipio1.synchronisingThreads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteExample {

    public static void main(String[] args) {
        List<String> testList = new ArrayList<>(List.of("Tomasz", "Cyprian", "Piotr"));

        CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>(testList);

        System.out.println("Init list: " + testList);
        // If you change copyOnWriteArrayList for a testList, you will get a java.util.ConcurrentModificationException
        testList(copyOnWriteArrayList);
        System.out.println("List after modifications: " + copyOnWriteArrayList);

    }


    // This methods iterates through list and modifies is at the same time
    private static void testList(List<String> list) {
        for (String object : list) {
            list.remove(object);
            list.add("New: " + object);
        }
    }
}



