package com.pkonopacki1;

public class StringBuilders {
    public static void main(String[] args) {
        testCapacity();
        testDelete();
        testInsert();
        
    }

    private static void testCapacity() {
        System.out.println("-----TEST CAPACITY-----");

        StringBuilder sb = new StringBuilder();
        System.out.println("Capacity of empty StringBuilder: " + sb.capacity() + ", length: " + sb.length());

        sb.append("not empty and long text");
        System.out.println("Capacity of: " + sb + ": " + sb.capacity() + ", length: " + sb.length());
    }

    private static void testDelete() {
        System.out.println("-----TEST DELETE-----");

        // You can exceed the length of deleted file, but you can't start at exceeding length
        StringBuilder sb = new StringBuilder("test string");
        System.out.println("For text of length: " + sb.length() + ", sb.delete(4, 100) returns: " + sb.delete(4, 100));
    }

    private static void testInsert() {
        System.out.println("-----TEST INSERT-----");

        StringBuilder sb = new StringBuilder("Some random text");
        sb.insert(5, "hello world", 0, 6);
        System.out.println(sb);

    }
    
}
