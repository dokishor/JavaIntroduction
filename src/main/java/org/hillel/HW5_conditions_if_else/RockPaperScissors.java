package org.hillel.HW5_conditions_if_else;

import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //input of the first number that defines the first condition
        System.out.println("Enter first number: ");
        int firstNumberParticipant = scanner.nextInt();
        while (firstNumberParticipant < 0 || firstNumberParticipant > 10) {
            System.out.println("Enter a number within the specified range (0-10)!!");
            firstNumberParticipant = scanner.nextInt();
        }

        //input of the second number that defines the first condition
        System.out.println("Enter second number: ");
        int secondNumberParticipant = scanner.nextInt();
        while (secondNumberParticipant < 0 || secondNumberParticipant > 10) {
            System.out.println("Enter a number within the specified range (0-10)!!");
            secondNumberParticipant = scanner.nextInt();
        }

        //input of the third number that defines the first condition
        System.out.println("Enter third number: ");
        int thirdNumberParticipant = scanner.nextInt();
        while (thirdNumberParticipant < 0 || thirdNumberParticipant > 10) {
            System.out.println("Enter a number within the specified range (0-10)!!");
            thirdNumberParticipant = scanner.nextInt();
        }
        int result = firstNumberParticipant + secondNumberParticipant + thirdNumberParticipant;
        System.out.println("Sum of three numbers: " + result);

        //output result
        if (result < 10)
            System.out.println("Rock");
        else if (result > 10 && result < 20)
            System.out.println("Scissors");
        else if (result > 20 && result < 30)
            System.out.println("Paper");
        if (result == 10 || result == 20 || result == 30)
            System.out.println("sump");
    }
}






