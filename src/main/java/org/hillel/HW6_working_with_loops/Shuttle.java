package org.hillel.HW6_working_with_loops;

public class Shuttle {
    public static void main(String[] args) {

        int a = 1;
        for (a = 1; a <= 100; a++) {
            if (a % 10 != 4 && a % 10 != 9 && a / 10 != 4 && a / 10 != 9 && a < 10)
                System.out.println("Shuttle numb: " + "000" + a);
            else if (a % 10 != 4 && a % 10 != 9 && a / 10 != 4 && a / 10 != 9 && a >= 10 && a < 99)
                System.out.println("Shuttle numb: " + "00" + a);
            else if (a % 10 != 4 && a % 10 != 9 && a / 10 != 4 && a / 10 != 9 && a >= 100)
                System.out.println("Shuttle numb: " + "0" + a);
        }


    }
}




