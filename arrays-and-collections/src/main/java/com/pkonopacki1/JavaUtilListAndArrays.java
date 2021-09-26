package com.pkonopacki1;

import java.util.Arrays;
import java.util.List;

public class JavaUtilListAndArrays {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("abc", "def");
        // list.add("new string"); // this will return RunTimeException, returned list has umodifiable size
        list.set(0, "new string"); // This works fine, we still can modify elements

        List<String> list2 = List.of("abc", "def");
        list2.set(0, "new string"); //This will throw an java.lang.UnsupportedOperationException, this list is umodifiable
    }
    
}
