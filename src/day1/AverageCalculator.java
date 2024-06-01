package day1;

import java.util.Scanner;

public class AverageCalculator {

    public static void main(String[] args) {

        // Create Scanner object

        Scanner userInput = new Scanner(System.in);

        // Ask user to enter the first input
        System.out.print("Enter the first number: ");
                // Get the first number and store it in a variable
        double first = userInput.nextDouble();

        // Ask user to enter the second input
        System.out.print("Enter the second number: ");
        // Get the second number and store it in a variable
        double second = userInput.nextDouble();

        // Ask user to enter the third input
        System.out.print("Enter the third number: ");
        // Get the third number and store it in a variable
        double third = userInput.nextDouble();

        // Calculate the average of 3 numbers

        double result = (first+second+third)/3;

        System.out.print("The Average of the numbers " + result);






    }
}
