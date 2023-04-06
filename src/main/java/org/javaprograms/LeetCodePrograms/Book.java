package org.javaprograms.LeetCodePrograms;
public abstract class Book {
    String name;
    String author;
    double price;

    // Abstract keyword 
    abstract void getDetails();

    // Param  Constructor method used to implement with the reference's values.
    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }
}
