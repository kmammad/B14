package day1;

import java.util.Scanner;

public class AmountCostOfGas {

    public static void main(String[] args) {

        //Create a name of the program

        System.out.println("This program will calculate the estimated cost of gas for your trip");

        //Create Scanner Object

        Scanner userInput = new Scanner(System.in);

        // Ask user to enter the distance in miles
        System.out.print("Please enter the distance that you are planning to travel in miles: ");
        // Get the first number and store it in a variable
        double distance = userInput.nextDouble();

        // Ask user to enter the average MPG of the car
        System.out.print("Please enter the average MPG of the car that you are planning to drive: ");
        // Get the second number and store it in a variable
        double mpg = userInput.nextDouble();

        // Ask user to enter the current gas price
        System.out.print("Please enter the current gas price: ");
        // Get the third number and store it in a variable
        double gasPrice = userInput.nextDouble();

        // Calculate the amount gas for the trip

        double gasAmount = distance / mpg;

        // Calculate the estimated cost of gas for the trip

        double costOfGas = gasAmount * gasPrice;

        System.out.print("Estimated amount of gas for your trip is " + gasAmount + " and estimated cost of gas is " + "$" + costOfGas);


    }




}
