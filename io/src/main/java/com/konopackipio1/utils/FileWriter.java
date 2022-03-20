package com.konopackipio1.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileWriter {

    public static void writeFile(Path path, String content) {
        
        try {
            Files.write(path, content.getBytes());
        } catch (IOException e) {
            System.err.println("Could not write to file: " + path.getFileName());
        }
    }
    
}
