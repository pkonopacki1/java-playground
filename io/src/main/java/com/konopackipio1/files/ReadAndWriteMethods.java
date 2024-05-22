package com.konopackipio1.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteMethods {

    public static void main(String[] args) {
        System.out.println("Creating file...");
        Path testFile = Path.of("./testFile.txt");
        createDirectory(testFile.getParent());
        writeToFile(testFile);
        System.out.println("Reading from file and printing the output...");
        readFromFile(testFile);
    }

    private static void readFromFile(Path path) {
        try {
            Files.lines(path)
                    .filter((l) -> l.startsWith("A"))
                    .forEach(System.out::println);
        } catch (IOException e) {
            System.err.println("Could not read file");
        }

    }

    private static void writeToFile(Path testFile) {
        try {
            List<String> names = new ArrayList<>(List.of("Ana", "Thoms", "Adam"));
            Files.write(testFile, names, StandardOpenOption.CREATE_NEW);
        } catch (IOException e) {
            System.err.println("Could not delete the file: " + testFile.toString());
        }
    }

    private static void createDirectory(Path directory) {
        try {
            Files.createDirectories(directory);
        } catch (IOException e) {
            System.err.println("Could not create directory: " + directory.toString());
        }
    }

}
