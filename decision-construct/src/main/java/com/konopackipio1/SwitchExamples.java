package com.konopackipio1;

public class SwitchExamples {
    public static void main(String[] args) {

        // This method show different weird switch cases
        int x = 1;

        // There are no matching cases, defualt will be executed
        switch (x) {
            default: 
                System.out.println("Go into default");
            case 2:
                System.out.println("Go into 1");
                break;
        }

        System.out.println("-------------------");

        // There are matching cases, default won't be executed, even if it is first
        switch (x) {
            default: 
                System.out.println("Go into default");
            case 1:
                System.out.println("Go into 1");

        }
    }
    
}
