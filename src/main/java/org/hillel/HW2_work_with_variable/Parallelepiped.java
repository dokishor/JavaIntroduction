package org.hillel.HW2_work_with_variable;

import java.util.Scanner;

public class Parallelepiped {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Внесите длинну: ");
        int a = scan.nextInt();
        while (a < 0) {
            System.out.println("Введите корректные данные: ");
            a = scan.nextInt();
        }
        System.out.println("Внесите ширину: ");
        int b = scan.nextInt();
        while (b < 0) {
            System.out.println("Введите корректные данные: ");
            b = scan.nextInt();
        }
        System.out.println("Внесите высоту: ");
        int c = scan.nextInt();
        while (c < 0) {
            System.out.println("Введите корректные данные: ");
            c = scan.nextInt();
        }
        long volume = (long) a * b * c;
        int length = 4 * (a + b + c);
        System.out.println("Oбъем параллелепипеда = " + volume);
        System.out.println("Сумма сторон параллелепипеда = " + length);
    }
}
