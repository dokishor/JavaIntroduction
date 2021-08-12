package org.hillel.HW6_working_with_loops;

public class Fibonacci {

    public static void main(String[] args) {

        int c = 1;
        int b = 1;
        int a;

        System.out.print("Fibonacci numbers: ");
        System.out.print(c + " " + b + " ");
        for (int i = 3; i <= 11; i++) {
            a = b + c;
            System.out.print(a + " ");
            c = b;
            b = a;
        }
    }
}



