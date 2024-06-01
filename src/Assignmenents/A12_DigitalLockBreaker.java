package Assignmenents;

import java.util.Scanner;

public class A12_DigitalLockBreaker {

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
/**
 **Digital Lock Breaker**

 Digital locks are devices that secure doors, safes, or compartments and can only be unlocked by entering the correct code. In some adventurous movies, we often see characters trying to guess the code of a digital lock to gain access to something valuable or crucial for their mission.

 Build a simulation of a digital lock breaker where a secret code between 0 and 100 (inclusive) is set. The user's task is to guess this secret code. After every guess, the program should provide hints like "Too high!" or "Too low!" to guide the user.

 Steps:

 - Display a welcome message introducing the user to the digital lock breaker challenge.
 - Generate a random secret code between 0 and 100.
 - Using a while loop, ask the user for their guess.
 - Provide feedback on whether the user's guess was too high, too low, or correct.
 - Continue the loop until the user successfully guesses the secret code.
 - Once the correct code is entered, congratulate the user and exit the program.
 Bonus:
 a. If a user enters a number outside the range of 0-100, instruct them to provide a number within the correct range and prompt them for their guess again.
 b. At the end of the game, tell the user how many attempts it took them to crack the digital lock.

 Example Output 1:

 Welcome to the Digital Lock Breaker challenge!
 Try to guess the secret code between 0 and 100.

 Enter your guess: 77
 Too high!

 Enter your guess: 44
 Too low!

 Enter your guess: 66
 Too high!

 Enter your guess: 55
 Too low!

 Enter your guess: 60
 Too low!

 Enter your guess: 63
 Correct! You've cracked the digital lock!


 Example Output 2 (With Bonus):

 Welcome to the Digital Lock Breaker challenge!
 Try to guess the secret code between 0 and 100.

 Enter your guess: 150
 Please enter a number between 0 and 100.

 Enter your guess: -5
 Please enter a number between 0 and 100.

 Enter your guess: 50
 Too high!

 Enter your guess: 25
 Too low!

 Enter your guess: 37
 Too high!

 Enter your guess: 33
 Correct! You've cracked the digital lock!
 It took you 4 attempts to find the secret code.

 */
