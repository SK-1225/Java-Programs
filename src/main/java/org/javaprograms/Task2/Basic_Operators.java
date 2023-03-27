package org.javaprograms.Task2;
public class Basic_Operators {
    public static void main(String[] args) {

        int age = 30;
        age = age + 1;
        System.out.println(age);
        age++;
        System.out.println(age);

        boolean isThattrue = age < 50;
        System.out.println(isThattrue);

        boolean operatorAnd = age > 27 && age < 50;
        boolean operatorOR = age > 27 || age < 50 || age < 90;
        System.out.println(operatorAnd);
        System.out.println(operatorOR);
    }
}
