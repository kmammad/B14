package ClassTasks;

import java.util.*;

public class T03_ModuloAndDivision {
    public static void main(String[] args) {


        Scanner in =  new Scanner(System.in);
        System.out.println("Enter a 4 digit number: ");
        int number =  in.nextInt();

        // Write your code here. Use the number variable above.

        int digit1 = number / 1000;
        int digit2 = (number % 1000) / 100;
        int digit3 = (number % 100) / 10;
        int digit4 = number % 10;


        int multiplication =  digit1 * digit2 * digit3 * digit4;

        int sumOfDigits = digit1 + digit2 + digit3 + digit4;

        int difference = multiplication - sumOfDigits;

        System.out.println(difference);
    }
}

/**
Given a four digit integer from the input, find the difference between the multiplication and sum of its digits

e.g 5852 ->  multiplication 400 (5x8x5x2), sum 20 (5+8+5+2)  ->  400-20=380


Example Output:

Enter the number:
        5852

The diffrence between the multiplication and sum of its digits:
        380
 */




