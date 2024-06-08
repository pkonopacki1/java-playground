package com.konopackipio1.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Util class with prepared methods for file reading
 */

public class FileReaders {

    public static void main(String[] args) {
        System.out.println("Reading small file...");
        List<String> smallFile = readSmallFile("./testFile.txt");
        smallFile.forEach(System.out::println);

        System.out.println("Reading big file...");
        List<String> bigFile = readBigFile("./testFile.txt");
        bigFile.forEach(System.out::println);
    }

    public static List<String> readSmallFile(String pathString) {
        List<String> readLines = new ArrayList<>();

        Path path = Paths.get(pathString);

        try {
            readLines = Files.readAllLines(path);
        } catch (IOException e) {
            System.err.println("Could not access the file: " + pathString);
        }

        return readLines;
    }

    public static List<String> readBigFile(String pathString) {
        List<String> readLines = new ArrayList<>();

        Path path = Paths.get(pathString);

        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                readLines.add(line);
            }
        } catch (IOException e) {
            System.err.println("Could not print file: " + pathString);
        }

        return readLines;
    }

}
