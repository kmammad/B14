package ClassTasks;

import java.util.*;

public class T17d_DiscountCalculator {

    public static void main(String[] args) {

        // Step 2.implement the main method logic using your method

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the original purchase amount: $");
        double originalPrice = scanner.nextDouble();

        System.out.println("Final Price: $" + calculateDiscountedPrice(originalPrice));
    }
    // Step 1. Create your method here

    public static double calculateDiscountedPrice(double originalPrice){

        double ten = originalPrice * 0.9;

        double twenty = originalPrice * 0.8;

        double finalPrice = originalPrice >= 500 ? twenty :
                originalPrice >= 100 ? ten : originalPrice;



        // if (originalPrice > 500.0) {
        /// finalPrice = twenty;
        //} else if (originalPrice >= 100.0 && originalPrice <= 500.0){
        // finalPrice = ten;
        //} else {
        // finalPrice = originalPrice;
        //}

        return finalPrice;
    }

}

/**
 * **Price Discount Calculator**
 *
 *
 * During special promotions or sales, stores often offer discounts on products based on the total purchase amount. For example, if a customer spends more than $100, they might get a 10% discount, but if they spend more than $500, the discount might increase to 20%.
 *
 * Create a Discount Calculator that calculates the final price after applying a discount based on the original purchase amount using the ternary expression.
 *
 * Steps:
 * 1. Create a method called calculateDiscountedPrice(double originalPrice).
 *    Use nested ternary expressions to determine the discount percentage:
 *
 *     Above $500: 20%
 *     Between $100 and $500: 10%
 *     Below $100: No discount
 *     Return the discounted price by applying the calculated discount to the originalPrice.
 *
 * 2. In the main method:
 *
 * Prompt the user to enter the original purchase amount.
 * Call the calculateDiscountedPrice method with the user's input and display the final price after discount.
 *
 * BONUS: Add another method to return the discount percentage based on the price and display the percentage in the main method
 *
 * Example 1:
 *
 * Enter the original purchase amount: 320
 *
 * Final Price: $288.00
 *
 *
 * Example 2:
 *
 * Enter the original purchase amount: 600
 *
 * Final Price: $480.00
 *
 * Example 3:
 *
 * Enter the original purchase amount: 50
 *
 * Final Price: $50.00
 */
