package Day8;

import java.util.Scanner;

public class LeapYearCheckerWithNonVoidMethod {

    public static void main(String[] args) {

        System.out.println("Enter a year " );
        int year = new Scanner(System.in).nextInt();

        if (isLeapYear(year)) {
            System.out.println("You can celebrate your birthday on February 29 in "+year+"!");
        } else {
            System.out.println("You should celebrate your birthday on either February 28 or March 1 in "+year+"!");
        }

    }

    public static boolean isLeapYear(int year){

        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

}
