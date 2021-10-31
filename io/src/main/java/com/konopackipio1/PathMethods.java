package com.konopackipio1;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathMethods {

    public static void main(String[] args) {
        testNormalize();   
        testRelativize();
        testResolve();
        testResolveSibling();
    }

    private static void testNormalize() {
        System.out.println("-----TEST NORMALIZE-----");

        Path p = Path.of("src/../target");
        System.out.println(p.toString() + ": " + p.normalize());

        // Path is not checked during normalize
        p = Path.of("src/badfolder/main");
        System.out.println(p.toString() + ": " + p.normalize());

        // Next two examples show that when we start with / we start from root, and can't go above that
        p = Path.of("/../../a");
        System.out.println(p.toString() + ": " + p.normalize());

        p = Path.of("../../a");
        System.out.println(p.toString() + ": " + p.normalize());
         
    }

    // Realtivize shows how ot get to the other path
    private static void testRelativize() {
        System.out.println("-----TEST RELATIVIZE-----");

        Path p1 = Path.of("src/main");
        Path p2 = Path.of("src/target/classes");
        System.out.println("To get from: " + p1.toString() + " to: " + p2.toString() + " : " + p1.relativize(p2));

        p1 = Path.of("src/main");
        p2 = Path.of("src/main/java");
        System.out.println("To get from: " + p1.toString() + " to: " + p2.toString() + " : " + p1.relativize(p2));
    }

    // Combining paths
    private static void testResolve() {
        System.out.println("-----TEST RESOLVE-----");

        Path p1 = Path.of("src/main");
        Path p2 = Path.of("src/target/classes");
        System.out.println("Resolve: " + p1.toString() + " on: " + p2.toString() + " : " + p1.resolve(p2));

        p1 = Path.of("src/main");
        p2 = Path.of("/java");
        System.out.println("Resolve: " + p1.toString() + " on: " + p2.toString() + " : " + p1.resolve(p2));
    }

    // Resolve sibling resolves path for folder that we assume is in the same directory
    private static void testResolveSibling() {
        System.out.println("-----TEST RESOLVESIBLING-----");

        Path p1 = Path.of("src/main");
        Path p2 = Path.of("target/classes");
        System.out.println("Resolve sibling: " + p1.toString() + " on: " + p2.toString() + " : " + p1.resolveSibling(p2));
    }
    
}
