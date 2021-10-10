package com.pkonopacki1.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

    public static void main(String[] args) {
        List initialData = List.of(10,20,50,40,30);
        boolean isDuplicatePossibe;


        System.out.println("-----HASH SET-----");
        Set setHashSet = new HashSet<>(initialData);
        System.out.println("The order of hashset is unpredictable: " + setHashSet);
        setHashSet.add(null);
        System.out.println("Adding null to a hashet" + setHashSet);
        isDuplicatePossibe = setHashSet.add(10);
        System.out.println("For all sets, adding duplicate returns " + isDuplicatePossibe);

        
        System.out.println("-----TREE SET-----");
        Set setTreeSet = new TreeSet<>(initialData);
        System.out.println("The order of treeset is natural" + setTreeSet);
        try{
            setTreeSet.add(null);
        } catch (Exception e) {
            System.out.println("Adding null to a treeset " + e);
        }

        System.out.println("-----LINKED HASH SET-----");
        Set setLinkedSet = new LinkedHashSet<>(initialData);
        System.out.println("The order of a linked hash set is the order of insertion: " + setLinkedSet);
        setLinkedSet.add(null);
        System.out.println("Adding null to a linked hash set: " + setLinkedSet);

        // We can compare different sets
        System.out.println("Can a hash set be equal to e.g. linked has set: " + setHashSet.equals(setLinkedSet));


        System.out.println("-----SOME TREE SET DIFFEREN METHODS-----");
        //Tree set implements Navigable

        TreeSet treeSet = (TreeSet) setTreeSet;
        System.out.print("Lower example: (0, 10, 20, 50): ");
        System.out.println(treeSet.lower(0) + ", " + treeSet.lower(10) + ", " + treeSet.lower(20) + ", " + treeSet.lower(50));

        System.out.print("Higher example: (0, 10, 20, 50): ");
        System.out.println(treeSet.higher(0) + ", " + treeSet.higher(10) + ", " + treeSet.higher(20) + ", " + treeSet.higher(50));

        // Difference between ceiling and higher is that ceiling returns >= value
        System.out.print("Ceiling example: (0, 10, 20, 50): ");
        System.out.println(treeSet.ceiling(0) + ", " + treeSet.ceiling(10) + ", " + treeSet.ceiling(20) + ", " + treeSet.ceiling(50));

    }
    
}
