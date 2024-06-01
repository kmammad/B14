package day2;

import java.util.Scanner;


public class ExtractingDigits {

    public static void main(String[] args) {

    // Given a 3-digit number, print it in reverse order

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please provide three digit number: ");

        int number = scanner.nextInt(); //567; //765


    // Get the third digit
        int third = number % 10; //567 % 10 -> 7

    //remove the last digit
        number = number / 10; // removes the last digit from number 567 -> 56

    //Get the next last digit
        int second = number % 10; //6  56 % 10 -> 6

    //remove the last digit
        number = number /10; // 56 /10 -> 5

        int first = number  % 10; // 5 % 10 = 5

        System.out.println("The number in reverse: " + third + second + first);





    }
}
