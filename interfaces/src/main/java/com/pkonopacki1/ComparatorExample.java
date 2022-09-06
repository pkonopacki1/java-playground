package com.pkonopacki1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {
        List<String> test = new ArrayList<>();

        test.add("całe pełne zdanie");
        test.add("jeden");
        test.add("dwa wyrazy");

        System.out.println("Przed posortowaniem: " + test);
        test.sort(new StringWordsCounter());
        System.out.println("Po posortownaiu: " + test);

    }

}

class StringWordsCounter implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.split(" ").length - o2.split(" ").length;
    }

}
