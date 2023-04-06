package org.javaprograms.LeetCodePrograms;

public class Printmybook extends Book {
    public Printmybook(String name, String author, double price) {
        super(name, author, price);
    }

    void getDetails() {
        System.out.println(this.name + " - "+ this.author + " - "+ this.price);
        }
}
