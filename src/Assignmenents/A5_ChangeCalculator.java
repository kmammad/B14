package Assignmenents;

import java.util.Scanner;

public class A5_ChangeCalculator {

    public static void main(String[] args) {

        //Write your code here

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total purchase amount: $");

        double purchaseAmount = scanner.nextDouble();


        System.out.print("Enter the amount given by the customer: $");

        double paidAmount = scanner.nextDouble();


        double change = paidAmount- purchaseAmount;

        System.out.println("Total change to be returned: $" + change);


        int changeInCents = (int)(change *100);

        System.out.println("Change break down: ");


        int bills100 = changeInCents / 10000;
        changeInCents = changeInCents % 10000;

        System.out.println("$100 bills: " + bills100);


        int bills50 = changeInCents / 5000;
        changeInCents = changeInCents % 5000;

        System.out.println("$50 bills: " + bills50);


        int bills20 = changeInCents / 2000;
        changeInCents = changeInCents % 2000;

        System.out.println("$20 bills: " + bills20);

        int bills10 = changeInCents / 1000;
        changeInCents = changeInCents % 1000;

        System.out.println("$10 bills: " + bills10);

        int bills5 = changeInCents / 500;
        changeInCents = changeInCents % 500;

        System.out.println("$5 bills: " + bills5);

        int bills1 = changeInCents / 100;
        changeInCents = changeInCents % 100;

        System.out.println("$1 bills: " + bills1);

        int quarters = changeInCents / 25;
        changeInCents = changeInCents %25;

        System.out.println("Quarters (25c): " + quarters);

        int dimes = changeInCents / 10;
        changeInCents = changeInCents % 10;

        System.out.println("Dimes (10c): " + quarters);

        int nickels = changeInCents / 5;
        changeInCents = changeInCents % 5;

        System.out.println("Nickels (5c): " + nickels);

        int pennies = changeInCents / 1;

        System.out.println("Pennies (1c): " + pennies);

    }

}

/** Create a Java program that calculates the change to be returned to a customer.
The program should display the number of each denomination (bills and coins) to be returned as change.

Steps:

Prompt the user to enter the total purchase amount (in dollars and cents, e.g., 15.75 for $15.75).
Prompt the user to enter the amount given by the customer.
Calculate the total change to be returned and display it to the the user.
Calculate the number of bills and coins to be returned as change. Denominations to be considered: $20, $10, $5, $1, 25c, 10c, 5c, 1c.
List the number of each denomination to be returned as change.

        Tip: First convert the dollar amount to cents (54.29 -> 5429) and use division and modulo operators to find out the count of denominations, starting from the largest to the smallest (for example, how many 2000s ($20) in 5429, then how many 1000s ($10) in the remaining 1429, etc)
Example Output:

Enter the total purchase amount: 15.75
Enter the amount given by the customer: 50
Total change to be returned is $34.25
Change breakdown:
$20 bills: 1
$10 bills: 1
$5 bills: 0
$1 bills: 4
Quarters (25c): 1
Dimes (10c): 0
Nickels (5c): 0
Pennies (1c): 0

Test your program with the additional examples of the output provided as screenshot files
 */
