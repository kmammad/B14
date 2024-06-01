package ClassTasks;

import java.util.*;

public class T24_ATmMachinePinVerification {

    public static void main(String[] args) {

        // Create your program here

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to DuoBank.");

        int correctPin = 1441;

        int attempts = 0;

        while(true){

            System.out.println("Please enter your pin.");
            int pin = input.nextInt();

            if(pin < 0){
                System.out.println("Invalid value. Please enter a positive value.");
                continue;
            }

            attempts++;

            if (pin == correctPin){
                System.out.println("Welcome to your account");
                break;
            }
            if (attempts == 3) {
                System.out.println("You entered wrong pin 3 times, your account is locked. Contact customer service.");
                break;
            }

        }
    }


}

/**
 * ATM Machine Pin Verification
 *
 * Automated Teller Machines (ATMs) are used by countless people every day. One of the primary security measures of an ATM is a PIN (Personal Identification Number) that the user must input correctly to access their account.
 *
 * Your task is to create an ATM simulation where the user is prompted to enter their PIN. The user should have a maximum of 3 attempts to input the correct PIN. If they fail all attempts, the account should be locked.
 *
 * Steps:
 *
 * 1. In the main method:
 *   Use a do-while loop (or while(true)) to prompt the user to enter their PIN.
 *   If the PIN is correct (assume the correct PIN is "1441"), display a welcome message and end the loop.
 *   If the PIN is incorrect, inform the user and prompt them to try again.
 *   If the user fails to enter the correct PIN in 3 attempts, display a message notifying them that their account has been locked and they should contact customer service.
 *
 * Example 1:
 *
 *        // Welcome to DuoBANK.
 *
 *         //Please enter your pin.
 *        // 1223
 *        // Please enter your pin:
 *        // 1222
 *        // Please enter your pin::
 *        // 1441
 *
 *        // Welcome to your account!
 *
 *
 *
 *   Example 2:
 *      // Welcome to DuoBANK.
 *
 *         //Please enter your pin.
 *        // 1223
 *        // Please enter your pin:
 *        // 1222
 *        // Please enter your pin::
 *        // 1232
 *
 *        // You entered wrong pin 3 times, your account is locked. Contact customer service.
 */