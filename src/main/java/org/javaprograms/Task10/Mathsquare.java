package org.javaprograms.Task10;

public class Mathsquare {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        double res = 0;
        res= Math.cbrt(Math.pow(a,2)+Math.pow(b,2)-Math.abs(c));
        System.out.println(res);
    }
}