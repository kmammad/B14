package ClassTasks;

import java.util.Scanner;

public class T25_FIzzBuzz {
    public static void main(String[] args) {

        // write your code here
        // implement the logic directly in the main method first

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the start number: ");
        int start = scanner.nextInt();

        System.out.println("Enter the end number: ");
        int end = scanner.nextInt();


        printFizzBuzz(start, end);

    }


    // create a method that takes start and end points of the number range and prints fizzbuzz

    public static void printFizzBuzz(int start, int end){

        for (int i = start; i <= end; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz" + " - " + i + " is divisible by 3 and 5");
            } else if (i % 3 == 0) {
                System.out.println("Fizz" + " - " + i + " is divisible by 3");
            } else if (i % 5 == 0) {
                System.out.println("Buzz" + " - " + i + " is divisible by 5");
            } else {
                System.out.println(i);
            }
        }


    }
}
/**
 * Classic FizzBuzz
 *
 * FizzBuzz is a simple programming task, often used in coding interviews. The rules are straightforward:
 *
 * For numbers 1 through 100:
 *   If the number is divisible by 3, print "Fizz".
 *   If the number is divisible by 5, print "Buzz".
 *   If the number is divisible by both 3 and 5, print "FizzBuzz".
 *   Otherwise, print the number itself.
 *
 *
 * Steps:
 *
 *   Use a for-loop to iterate over numbers from 1 to 100.
 *   Within the loop:
 *   Check divisibility by 3 and 5 to decide what to print.
 *   Print the results accordingly.
 *
 * Extra Challenge:
 *
 * Allow the user to specify a different upper limit other than 100.
 * Let the user choose different numbers other than 3 and 5 and apply the FizzBuzz logic based on those numbers.
 *
 *      Expected output:
 *     /*
 *       1
 *       2
 *       Fizz
 *       4
 *       Buzz
 *       Fizz
 *       7
 *       8
 *       Fizz
 *       Buzz
 *       11
 *       Fizz
 *       13
 *       14
 *       FizzBuzz
 *       .
 *       .
 *       98
 *       Fizz
 *       Buzz
 *     */

