package day2;

import java.util.Scanner;

public class MilesToKmConverter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter miles: " );
        double miles = scanner.nextDouble();

        final double MILES_TO_KMS = 1.609;

        double distanceInKMs = miles * MILES_TO_KMS;

        System.out.println("The distance of " + miles + " miles in kilometers: " + distanceInKMs);


    }

}
