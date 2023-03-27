package org.javaprograms.Task4;

import java.util.Scanner;

public class Basic_While_Loop {
    public static void main(String[] args) {
        int CarNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Car Number: ");
        while((CarNumber = scanner.nextInt())!=0){
            System.out.println("Your Car is : "+CarNumber);
            }
        System.out.println("With Zero Cars should not enter in the road");
    }
}
