package com.konopackipio1.files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.sql.Date;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Stream;

public class FilesAndStreams {

    public static void main(String[] args) {
        testList();
        // testListAndWalk();    
        // testFind();    
    }

    // This is very useful method which allows reading file as a stream
    // In this example we show how to e.g. use filter from read liens
    private static void testList() {
        System.out.println("-----TEST FILES.LIST() METHOD-----");
        Path testFile = Path.of("streamTestFile.txt");       
        createTestFile(testFile);

        try {
            Files.lines(testFile)
                    .filter((l) -> l.startsWith("A"))
                    .forEach(System.out::println);
        } catch (IOException e) {
            System.err.println("Could not read file");
        }

    }

    private static void createTestFile(Path testFile) {        
        try {
            Files.deleteIfExists(testFile);
            List<String> names = new ArrayList<>(List.of("Ana", "Thoms", "Adam"));
            Files.write(testFile, names, StandardOpenOption.CREATE_NEW);          
        } catch (IOException e) {
            System.err.println("Could not delete the file: " + testFile.toString());
        }
    }

    // Difference between list and walk is that list does not go into the child directory, walk does
    private static void testListAndWalk() {
        System.out.println("-----TEST LIST AND WALK-----");
        Path src = Path.of("src");
        
        System.out.println("List example: ");
        try (Stream<Path> srcPaths = Files.list(src)) {
            srcPaths.forEach(System.out::println);            
        } catch (Exception e) {
            System.err.println(e);
        }

        System.out.println("Walk example: ");
        try(Stream<Path> srcWalkPaths = Files.walk(src, 2)) { 
            srcWalkPaths.forEach(System.out::println);
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    private static void testFind() {
        System.out.println("-----TEST FIND-----");
        Path src = Path.of("src");

        BiPredicate<Path, BasicFileAttributes> endsWithJava = (p, a) -> {
            return p.getFileName().toString().endsWith("java") && a.isRegularFile();
        };

        BiPredicate<Path, BasicFileAttributes> modifiedLastDay = (p, a) -> {
            LocalDateTime now = LocalDateTime.now();
            LocalDateTime fileTime = LocalDateTime.ofInstant(a.lastModifiedTime().toInstant(), ZoneId.systemDefault());
            return fileTime.plusDays(1).isAfter(now);
        };

        System.out.println("Found java files: ");
        try (Stream<Path> str = Files.find(src, 10, endsWithJava.and(modifiedLastDay))) {
            str.forEach(System.out::println);            
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
}
