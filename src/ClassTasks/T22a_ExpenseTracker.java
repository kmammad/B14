package ClassTasks;

import java.util.Scanner;

public class T22a_ExpenseTracker {
    public static void main(String[] args) {

        // Write your code here
        System.out.println("Welocme to the Daily Expense Tracker!");

        Scanner scan = new Scanner(System.in);

        System.out.println("PLease enter your latest expense amount: ");

        double expense = scan.nextDouble();

        double total = 0.0;

        System.out.println("Do you have more expenses to enter for the day? (yes/no): ");

        String answer = scan.next();

        while (!answer.equals("no")) {

            System.out.println("PLease enter your latest expense amount: ");

            expense = scan.nextDouble();
            total += expense;

            System.out.println("Do you have more expenses to enter for the day? (yes/no): ");
            answer = scan.next();

        }

        System.out.println("You have spent a total of:" + "$" + total);


    }

}

/**
 * Expense Tracker
 *
 * Develop a program that allows users to track their daily expenses. The user will enter each expense amount one by one, and the program will keep a running total. The program should continue to accumulate these expenses until the user decides to stop entering more expenses for the day.
 *
 * Steps:
 *
 * In the main method:
 * 1. Print a welcoming message: "Welcome to the Daily Expense Tracker!"
 * 2. Initialize an accumulator variable, totalExpenses, to zero.
 * 3. Use a loop to:
 *     - Prompt the user to enter the amount for their latest expense.
 *     - Add this amount to totalExpenses.
 *     - Ask the user if they have more expenses to enter for the day. If they say 'no' (or a similar negative response), end the loop.
 *     - After exiting the loop, display the total daily expenses: "You have spent a total of [totalExpenses] today!"
 *
 * Bonus:
 * Ensure that the user enters a valid positive number for each expense. If they enter an invalid amount, prompt them to enter the amount again.
 *
 * Example:
 *
 * Welcome to the Daily Expense Tracker!
 *
 * Please enter your latest expense amount: 5.50
 * Do you have more expenses to enter for the day? (yes/no): yes
 *
 * Please enter your latest expense amount: 15.75
 * Do you have more expenses to enter for the day? (yes/no): yes
 *
 * Please enter your latest expense amount: -10
 * Invalid amount. Please enter a positive value.
 *
 * Please enter your latest expense amount: 10
 * Do you have more expenses to enter for the day? (yes/no): no
 *
 * You have spent a total of $31.25 today!
 */