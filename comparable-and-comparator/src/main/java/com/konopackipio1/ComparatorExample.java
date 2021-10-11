package com.konopackipio1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Comparator is typically for different than natural comparison


class LastNameComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        String[] names1 = o1.split("\\s+");
        String[] names2 = o2.split("\\s+");

        return(names1[names1.length -1].length() - names2[names2.length - 1].length());
    }
    
}

public class ComparatorExample {
    public static void main(String[] args) {
        String[] names = {
            "John Smith",
            "Tim Ferris",
            "Golgonder",
            "Fiho Lapanumpka"    
        };

        ArrayList<String> namesList = new ArrayList<>(List.of(names));
        System.out.println(namesList);
        namesList.sort(Comparator.naturalOrder());
        System.out.println(namesList);
        namesList.sort(Comparator.reverseOrder());
        System.out.println(namesList);

        // Using custom comparator
        LastNameComparator l = new LastNameComparator();
        System.out.println("Custom comparator: ");
        namesList.sort(l);
        System.out.println(namesList);
        namesList.sort(l.reversed());
        System.out.println(namesList);
        
    }


    
}
