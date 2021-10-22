package com.konopackipio1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamCollectors {
    public static void main(String[] args) {
        List<String> initStringData = new ArrayList<>(List.of("Tomasz", "Cyprian", "Piotr"));
        
        // Collectors.join
        String joinedString = initStringData.stream().collect(Collectors.joining());
        System.out.println(joinedString);

        String joinedString2 = initStringData.stream().collect(Collectors.joining(", "));
        System.out.println(joinedString2);
    }

    

    
    
    
}
