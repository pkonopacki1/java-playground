package com.pkonopacki1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

// Class showing different possibilities of try-catch-fianlly blocks

public class TryCatchBlocks {

    public static void main(String[] args) {
        try {
            FileInputStream tFileInputStream = new FileInputStream("IDontExtist.txt");
        } catch(FileNotFoundException f) {
            System.out.println("File not found exception block: ");
            Exceptions.printParentClasses(f);
        } catch(Throwable t) {
            System.out.println("Throwable block: ");
            Exceptions.printParentClasses(t);
        }
    }
    
}
