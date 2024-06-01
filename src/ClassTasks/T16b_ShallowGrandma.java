package ClassTasks;

import java.util.*;

public class T16b_ShallowGrandma {

    public static void main(String[] args) {

        // implement the logic here

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the suitor's age: ");
        double age = scanner.nextDouble();

        System.out.println("Enter the suitor's yearly income (in thousands): ");
        double income = scanner.nextDouble();

        System.out.println("Rate the suitor's looks on a scale of 1-10: ");

        double looks = scanner.nextDouble();

        if ( (age > 25 && age < 40) && (income > 500 || looks > 8.5) ) {
            System.out.println("This suitor is Grandma-approved! 🎉");
        } else {System.out.println("Sorry, this one's not getting past Grandma. 🚫");
        }
    }
}

/**
 * "Grandma's Boyfriend Evaluator" 👵💍🤵
 *
 * Objective:
 * In this task, you will step into Grandma's shoes and create a program that evaluates potential boyfriends for her precious granddaughter. Using compound conditional statements, you will determine if a suitor is eligible based on Grandma's unique criteria.
 *
 * Grandma's criteria for the perfect boyfriend are:
 *
 * Age: The suitor's age must be between 25 and 40, inclusive.
 * Income: The suitor must earn over 500k a year.
 * Looks: On a scale of 1-10, the suitor's looks must be rated above 8.5.
 * The twist? If the suitor doesn't meet the income requirement, they can still be eligible if they score high on looks!
 *
 * Steps:
 * 1. User Input:
 *   Ask the user to input details about the potential boyfriend:
 *
 * "Enter the suitor's age: "
 * "Enter the suitor's yearly income (in thousands): "
 * "Rate the suitor's looks on a scale of 1-10: "
 *
 * 2. Evaluation using compound conditional statements:
 *   Determine if the suitor is eligible to date Grandma's granddaughter:
 *
 *   If the age is between 25-40 and either income is over 500 or looks are above 8.5, the suitor is eligible.
 *   Otherwise, they're not.
 *
 * 3. Display Evaluation Result:
 *
 * Print out whether the suitor is eligible or not:
 *
 *   Eligible: "This suitor is Grandma-approved! 🎉"
 *   Not eligible: "Sorry, this one's not getting past Grandma. 🚫"
 *
 *
 *
 *
 * Example output 1:
 *
 * Enter the suitor's age: 28
 * Enter the suitor's yearly income (in thousands): 600
 * Rate the suitor's looks on a scale of 1-10: 9
 * This suitor is Grandma-approved! 🎉
 *
 * Example output 2:
 *
 * Enter the suitor's age: 30
 * Enter the suitor's yearly income (in thousands): 400
 * Rate the suitor's looks on a scale of 1-10: 8
 * This suitor is Grandma-approved! 🎉
 *
 * Example output 3:
 *
 * Enter the suitor's age: 35
 * Enter the suitor's yearly income (in thousands): 480
 * Rate the suitor's looks on a scale of 1-10: 8.7
 * This suitor is Grandma-approved! 🎉
 *
 *
 * Example output 4:
 *
 * Enter the suitor's age: 22
 * Enter the suitor's yearly income (in thousands): 700
 * Rate the suitor's looks on a scale of 1-10: 9.9
 * Sorry, this one's not getting past Grandma. 🚫
 *
 */
