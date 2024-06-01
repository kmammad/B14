package Day11;

import java.util.Scanner;

public class DigitalLockMess {

    public static void main(String[] args) {

        // Write all your code here
        System.out.println("Welcome to the Digital Lock Breaker Challenge!");
        System.out.println("Try to guess the secret code between 0 and 100");

        int secretCode = (int)(Math.random()*101+0);
        //  System.out.println("Secret code is " + secretCode);

        System.out.print("Enter your guess: ");

        Scanner scanner = new Scanner(System.in);

        int guess = scanner.nextInt();
        int tries = 1;

        while (guess != secretCode){

            if(guess < 0 || guess > 100){
                System.out.println("Please enter a number between 0 and 100");
            } else if(guess < secretCode) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }

            System.out.print("Enter your guess ");
            guess = scanner.nextInt();
            tries++;

        }

        System.out.println("Correct! You've cracked the digital lock!");
        System.out.print("It took you " + tries + " attempts to find the secret code.");

    }



}
