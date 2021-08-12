package org.hillel.HW6_working_with_loops;

import java.util.Scanner;

public class Fifa {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter command code: ");
        int teamNumb = scan.nextInt();
        checkingTheAgreedRangeOfNumbers(teamNumb, 1, 10);

        switch (teamNumb) {
            case 1:
                System.out.println("Ajax");
                break;
            case 2:
                System.out.println("Barcelona");
                break;
            case 3:
                System.out.println("Bayern");
                break;
            case 4:
                System.out.println("Chelsea");
                break;
            case 5:
                System.out.println("Dortmund ");
                break;
            case 6:
                System.out.println("Liverpool");
                break;
            case 7:
                System.out.println("Porto");
                break;
            case 8:
                System.out.println("Man. City");
                break;
            case 9:
                System.out.println("Shakhtar Donetsk");
                break;
            case 10:
                System.out.println("Slavia Praha");
        }

        System.out.println("Points per season: ");
        int teamScores = scan.nextInt();
        checkingTheAgreedRangeOfNumbers(teamScores, 1, 300);

        System.out.println("Odds of bets per team (fractional number by a COMMA): ");
        double teamCoefficient = scan.nextDouble();
        checkingTheAgreedRangeOfNumbers(teamCoefficient, 0.1, 10);
        double resultLig = teamCoefficient * teamScores;

        System.out.println("Total points: " + (teamCoefficient * teamScores));
        //result of football teams
        if (resultLig >= 0 && resultLig < 1000) {
            System.out.println("The team plays in the national championship");
        } else if (resultLig >= 1000 && resultLig < 2000) {
            System.out.println("The team plays in the europa league");
        } else if (resultLig >= 2000 && resultLig <= 3000)
            System.out.println("The team plays in the Champions League");
    }

    //checking the agreed range of numbers
    public static void checkingTheAgreedRangeOfNumbers(double teamCoefficient, double bottomLine, double upperBound) {
        Scanner scan = new Scanner(System.in);
        while (teamCoefficient < bottomLine || teamCoefficient > upperBound) {
            System.out.println("Please enter the correct number: ");
            teamCoefficient = scan.nextDouble();
        }
    }
}
