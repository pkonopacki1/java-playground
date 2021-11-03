package com.konopackipio1.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesCopyMoveDelete {
    static private Path directory = Path.of("testA/testB/testC");

    public static void main(String[] args) {
        testCreateDirectory();


        cleanCreatedDirecotry();
    }

    private static void testCreateDirectory() {
        try {
            Files.createDirectories(directory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void cleanCreatedDirecotry() {
        while (directory != null) {
            try {
                Files.delete(directory);
            } catch (IOException e) {
                e.printStackTrace();
            }
            directory = directory.getParent();            
        }
    }
    
}
