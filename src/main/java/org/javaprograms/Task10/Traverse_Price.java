package org.javaprograms.Task10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class Traverse_Price {
    //Traverse_HashMap_Price_Update for the product update in E-Commerce Website with basic java code need to use it
    public static void main(String[] args) {
        // Creating an Hashmap of string-integer pairs, It contains student name and their marks
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        // Adding mappings to above HashMap using put() method
        hm.put("Apple", 180);
        hm.put("Orange", 150);
        hm.put("Graphs", 90);
        // Printing all elements of HashMap
        System.out.println("Before price is : " + hm);
        // Getting an iterator
        Iterator hmIterator = hm.entrySet().iterator();
        // Display message only
        System.out.println("HashMap after adding prices hike:");
        // Iterating through Hashmap and
        // adding some bonus marks for every student
        while (hmIterator.hasNext()) {
            Map.Entry mapElement = (Map.Entry)hmIterator.next();
            int marks = ((int)mapElement.getValue() + 10);
            // Printing mark corresponding to string entries
            System.out.println("After price hike "+ mapElement.getKey() + " : "+ marks);
        }
    }
}