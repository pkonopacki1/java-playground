package com.konopackipio1.path;

import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExamples {
    public static void main(String[] args) {
        pathCreations();
    }


    // This method shows different ways to create a path
    private static void pathCreations() {

        System.out.println("-----Paths example-----");
        
        // Current working directory
        Path cwd = Paths.get("");
        System.out.println(cwd.toAbsolutePath());

        Path cdir = Paths.get("c:\\Users\\48502\\OneDrive\\Programming\\java-playground'");
        System.out.println(cdir);

        // Path as many arguments
        Path cdir2 = Paths.get("c:\\Users\\48502\\OneDrive", "Programming\\java-playground");
        System.out.println(cdir2);

        // Path.of mulit object factory
        Path cdir3 = Path.of("C:", "Users", "48502");
        System.out.println(cdir3);

        // File reference
        Path fileReference = Paths.get(URI.create("file:///Users/48502/OneDrive/Programming/java-playground/io/randomNumbers.txt"));
        System.out.println(fileReference.toAbsolutePath());

    }
    
}
