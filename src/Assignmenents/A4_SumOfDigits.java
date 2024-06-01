package Assignmenents;

import java.util.Scanner;

public class A4_SumOfDigits {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.print("Enter a number between 1-999:");
            int number = scan.nextInt();

            System.out.println("You entered: " + number);

            int first = number /100;
            int second = (number / 10)%10;
            int last = number % 10;

            int sum = first + second + last;

            System.out.println("The sum of entered numbers is: " + sum);

            //DON'T CHANGE THE CODE ABOVE
            //Write your code below.
            //Use the "number" variable that is declared above to calculate the sum of its digits.

        }
}
/** Create a program that gets input from the user as an integer number between 1-999 (1 and 999 included) and calculates the sum of the digits of the entered number. (The code for getting the input has already been written for you)

For example, if the entered number is 473, it should display 14 as a result  (4+7+3=14).

If the entered number is 67, it should display 13 as a result(6+7=13).

If the entered number is 5, it should display 5 as a result.

        Use division (/) and modulo (%) operators to achieve the result.

Your program should work correctly with numbers in the range 1-999.

Your program should only print out only one value (sum of digits) at the end, nothing else.

Example 1:

Enter a number between 1-999: 234
        9

Example 2:

Enter a number between 1-999: 589
        22

Example 3:

Enter a number between 1-999: 782
        17 */




