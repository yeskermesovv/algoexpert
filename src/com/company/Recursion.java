package com.company;

public class Recursion {
    public static void main(String[] args) {
        System.out.println("fact(5) = " + fact(5));
    }
    
    private static int fact(int x) {
        if (x == 1) {
            return x;
        } else {
            return x * fact(x - 1);
        }
    }
}
