package com.pkonopacki1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// Class showing different possibilities of try-catch-fianlly blocks

public class TryCatchBlocks {

    public static void main(String[] args) {
        try {
            String property = readPropertyFromFile("propertyfile.txt");
        } catch(FileNotFoundException f) {
            System.out.println("File not found exception block: ");
            Exceptions.printParentClasses(f);
        } catch(Throwable t) {
            System.out.println("Throwable block: ");
            Exceptions.printParentClasses(t);
        }
    }


    // Below functions show how try-finally block looks like. Finally is executed ALWAYS
    private static String readPropertyFromFile(String fileName) throws IOException {
        String property;
        BufferedReader br = new BufferedReader(new FileReader(fileName));

        try {
            String line = br.readLine();
            property = line.split("\\s")[1];
            System.out.println("Property: " + property);
        } finally {
            System.out.println("Finally block execution");
            if(br != null) br.close();
        }
        return property;

    }
    
}
