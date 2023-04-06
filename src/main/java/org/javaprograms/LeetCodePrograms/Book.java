package org.javaprograms.LeetCodePrograms;
public abstract class Book {
    String name;
    String author;
    double price;

    abstract void getDetails();

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }
}
