package Day8;

import java.util.Scanner;

public class ReturnMethodDiscountedPrice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the original purchase amount: ");

        double originalPrice = input.nextDouble();

        double finalPrice = calculateDiscountedPrice(originalPrice);


        System.out.println("Your final discounted price is: " + finalPrice);


    }

public static double calculateDiscountedPrice(double originalPrice){

        double discounted = originalPrice >= 500 ? originalPrice - originalPrice * 0.2 :
                            originalPrice >= 100 ? originalPrice = originalPrice * 0.1 :
                            originalPrice;

        return discounted;


    }


}
