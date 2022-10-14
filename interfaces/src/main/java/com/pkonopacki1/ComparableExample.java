package com.pkonopacki1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ComparableExample {

    public static void main(String[] args) {
        // TreeSet implementation of sorts objects in natural order
        Set<Book> books = new TreeSet<>();
        books.add(new Book("Tolkien", "Lord of the rings"));
        books.add(new Book("Tolkien", "Hobbit"));
        books.add(new Book("Rowling", "Harry Potter"));

        Set<Book> booksNotSorted = new HashSet<>();
        booksNotSorted.add(new Book("Tolkien", "Lord of the rings"));
        booksNotSorted.add(new Book("Tolkien", "Hobbit"));
        booksNotSorted.add(new Book("Rowling", "Harry Potter"));

        System.out.println("Not sorted books:" + booksNotSorted);
        System.out.println("Sorted books:" + books);
    }

}

class Book implements Comparable<Book> {

    private final String author;
    private final String titile;

    public Book(String author, String titile) {
        this.author = author;
        this.titile = titile;
    }

    @Override
    public int compareTo(Book o) {
        int compareAuthors = this.author.compareTo(o.getAuthor());
        if (compareAuthors != 0) {
            return compareAuthors;
        } else {
            return this.titile.compareTo(o.getTitile());
        }
    }

    public String getTitile() {
        return titile;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return author + ": " + titile;
    }

}
