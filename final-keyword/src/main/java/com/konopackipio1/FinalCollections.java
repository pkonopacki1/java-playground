package com.konopackipio1;

import java.util.Collections;
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
        // NOTICE: we could still modify setCorrect through temp reference, this is why
        // we don't return it
        Set<String> temp = new HashSet<>();
        temp.add("watermelon");
        temp.add("mango");
        setCorrect = Collections.unmodifiableSet(temp);
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
