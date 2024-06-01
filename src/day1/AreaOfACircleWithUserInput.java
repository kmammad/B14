package day1;

import java.util.Scanner;


public class AreaOfACircleWithUserInput {

    public static void main(String[] args) {


        // Prompt the user to enter the radius

        System.out.print("Enter the radius of a circle: "); // without LN print will be on the same line

        Scanner input = new Scanner(System.in);

        double radius = input.nextDouble();


        //Calculate the area using the formula and store it -> area = pi *radius * radius

        double pi = 3.14159265;
        double area = radius * radius * pi;

        //Display the result

        System.out.println("The area of a circle with radius " + radius + " is " + area);


    }
}
