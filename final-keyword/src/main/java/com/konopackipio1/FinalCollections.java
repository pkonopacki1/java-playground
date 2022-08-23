package com.konopackipio1;

import java.util.HashSet;
import java.util.Set;

public class FinalCollections {

    final static Set<String> setIncorrect;
    final static Set<String> setCorrect;

    static {
        // This is incorrect, although we create final reference, the object itself is
        // modifiable
        setIncorrect = new HashSet<>();
        setIncorrect.add("apple");
        setIncorrect.add("banana");

        // This approach is correct because we return unmodifiable set
        setCorrect = Set.copyOf(setIncorrect);
    }

    public static void main(String[] args) {
        setIncorrect.add("pear");

        try {
            setCorrect.add("grape");
        } catch (UnsupportedOperationException e) {
            System.err.println("Can not modify unmodifiable set: " + e);
        }

        System.out.println("Incorrect set: " + setIncorrect);
        System.out.println("Correct set: " + setCorrect);
    }
}
