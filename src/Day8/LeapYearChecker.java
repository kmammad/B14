package Day8;

import java.util.Scanner;

public class LeapYearChecker {

    public static void main(String[] args) {

        //rules for determining a leap year:
        // - A year is a leap year if it is divisble by 4 and not divisible by 100
        // - Year is a leap year if it is divisible by 400
        // examples leap 2020, 2024
        // not 2022, 2023, 2001

        System.out.println("Enter a year " );
        int year = new Scanner(System.in).nextInt();

        //boolean year = (year %4 = )

                if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
                    System.out.println("You can celebrate your birthday on February 29 in "+year+"!");
                }else {
                    System.out.println("You should celebrate your birthday on either February 28 or March 1 in "+year+"!");
                }
    }

}
