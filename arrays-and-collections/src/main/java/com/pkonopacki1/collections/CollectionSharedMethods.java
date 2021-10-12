package com.pkonopacki1.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

class TraversingThroughCollection {

    //Example of iterator
    public static void clearCollection(Collection<?> collection) {
        for (Iterator<?> it = collection.iterator() ; it.hasNext();) {
            it.next();
            it.remove();
        }
    }

    //Example of foreach
    public static void showCollectin(Collection<?> collection) {
        collection.forEach(System.out::print);
        //Example of stream, same as above
        // collection.stream().forEach(System.out::print);
    }
}

public class CollectionSharedMethods {

    public static void main(String[] args) {
        List<String> listOfString = new ArrayList<>(List.of("a", "b", "c"));

        TraversingThroughCollection.showCollectin(listOfString);
        TraversingThroughCollection.clearCollection(listOfString);
        TraversingThroughCollection.showCollectin(listOfString);
        
    
    }
    
}
