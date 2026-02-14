package com.pkonopacki1;

public class App {

    static class ExampleClass {

    }

    public static void main(String[] args) {
        int count = 10_000_000;
        Object[] objects = new Object[count];

        long before = getUsedMemory();
        for (int i = 0; i < count; i++) {
            objects[i] = new ExampleClass();
        }

        long after = getUsedMemory();
        long memoryUsed = after - before;

        System.out.println("Used memory before: " + before + " MB");
        System.out.println("Used memory after: " + after + " MB");
        System.out.println("Memory used: " + memoryUsed + " MB");
    }

    private static final long MEGABYTE = 1024L * 1024L;

    public static long bytesToMegabytes(long bytes) {
        return bytes / MEGABYTE;
    }

    static long getUsedMemory() {
        return bytesToMegabytes(Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory());
    }
}
