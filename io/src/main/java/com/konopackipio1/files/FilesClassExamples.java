package com.konopackipio1.files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Optional;

public class FilesClassExamples {

    public static void main(String[] args) {
        testExists();
        testFilesInfos();
        testReadWrite();

        File file = new File("randomNumbers.txt");
        System.out.println(file.listFiles());
    }

    private static void testExists() {
        System.out.println("-----TEST EXISTS-----");

        Path file = Path.of("randomNumbers.txt");
        Path file2 = Path.of("notExistingFile.txt");
        System.out.println(file.toString() + " exists: " + Files.exists(file));
        System.out.println(file2.toString() + " exists: " + Files.exists(file2));

        Path path = Path.of("src/main");
        Path path1 = Path.of("not/exist");
        System.out.println(path.toString() + " exists: " + Files.exists(path));
        System.out.println(path1.toString() + " exists: " + Files.exists(path1));
    }

    private static void testFilesInfos() {
        System.out.println("-----TEST FILES INFOS-----");
        Path file = Path.of("randomNumbers.txt");

        try {
            System.out.println(file.toString() + " size: " + Files.size(file) + "bytes");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void testReadWrite() {
        System.out.println("-----TEST READ AND WRITE-----");

        Path testFile = Path.of("testFile.txt");
        List<String> lines = null;
        // Reading file content with Files class
        try {
            lines = Files.readAllLines(testFile);
            lines.stream()
                    .forEach(System.out::print);
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Get new file name 
        Optional<String> newFileName = lines.stream()
                .filter(s -> s.startsWith("new"))
                .findFirst();

        if(newFileName.isPresent()) {
            // Here I create a new file which name I retrieved form a test file
            // Test file should have a line starting with 'new'
            Path newFile = Path.of(newFileName.get());
            try {
                Files.write(newFile, "New file created".getBytes(), StandardOpenOption.CREATE_NEW); // here also NEW is possible
                System.out.println(newFileName.get() + " file was created");
            } catch (IOException e) {
                System.err.println("New file: " + newFileName.get() + " could not be created: " + e);
            }

            // Showing wirte with multiple options
            newFile = Path.of(lines.get(0));
            try {
                Files.write(newFile, "Adding some text".getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            } catch (IOException e) {
                e.printStackTrace();
            }

        } else {
            System.out.println("File name not found");
        }
    }

    
    
}
