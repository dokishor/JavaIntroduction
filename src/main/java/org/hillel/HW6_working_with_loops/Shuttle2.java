package org.hillel.HW6_working_with_loops;

public class Shuttle2 {

    public static void main(String[] args) {
        int a = 0;

        do {
            a++;
            if (a % 10 != 4 && a % 10 != 9 && a / 10 != 4 && a / 10 != 9)
                System.out.println("Shuttle numb: " + a);
            else if (a % 10 != 4 && a % 10 != 9 && a / 10 != 4 && a / 10 != 9 && a >= 10)
                System.out.println("Shuttle numb: " + a);
        } while (a < 100);
    }
}
