package Assignmenents;

import java.util.Scanner;

public class A13_SecretEncoderAndDecoder {
    public static void main(String[] args) {

        // implement the main method code here

        System.out.println("Welcome to the Secret Encoder and Decoder!");

        System.out.println("Please choose an option!\n1. Encode a message.\n2. Decode a message.\n3. Exit.");

        Scanner scanner = new Scanner(System.in);

        int choice = scanner.nextInt();
        int tries = 1;

        while(!(choice >= 1 && choice <= 3)){
            System.out.println("Invalid choice. PLease enter 1-3");
            choice = scanner.nextInt();
            tries++;
        }


        String input = "";

        switch(choice){
            case 1:
                System.out.println("Enter your message to be encoded: ");
                scanner.nextLine();
                input = scanner.nextLine();
                break;
            case 2:
                System.out.println("Enter the message to be decoded: ");
                scanner.nextLine();
                input = scanner.nextLine();
                break;
        }

        String str1 = "" + reverseString(input);

        if (choice == 1){
            str1 = "Encoded message: " + reverseString(input);
        } else if (choice == 2) {
            str1 = "Decoded message: " + reverseString(input);
        } else {
            System.out.println("Goodbye! Keep those secrets safe");
        }


        System.out.println(str1);

    }


    // implement your method here

    public static String reverseString(String input) {

        int length = input.length();

        String str1 = "";


        for (int i = length-1; i >= 0; i--) {
            str1 += input.charAt(i);
        }

        return str1;

    }
}
/**
 **Secret Encoder and Decoder**

 Historically, secret codes and ciphers have been used to send hidden messages. One of the simplest ways to encode a message is to reverse its letters. In this task, you will be working on a simple "encryption" method by reversing input strings.

 Create a program that can both encode and decode a message by reversing it. The user should be able to choose whether they want to encode or decode a message.

 Steps:

 1. Define a method reverseString(String input):
 Loop through the string from the end to the start, accumulating each character in a new string. Return this new string.
 2. In the main method:

 - Display a menu to the user:
 1.Encode a message.
 2.Decode a message.
 3.Exit.
 - Based on user's choice:
 If the user chooses to encode: Prompt the user for a message, then display the encoded (reversed) version of it.
 If the user chooses to decode: Prompt the user for an encoded message, then display the decoded (original) version of it.
 If the user chooses to exit: Print a goodbye message and terminate the program.
 - Loop this menu until the user decides to exit.


 Example 1:

 Welcome to the Secret Encoder and Decoder!
 Please choose an option:
 1. Encode a message.
 2. Decode a message.
 3. Exit.
 Choice: 1

 Enter your message to be encoded: Hello World!
 Encoded message: !dlroW olleH

 Please choose an option:
 1. Encode a message.
 2. Decode a message.
 3. Exit.
 Choice: 2

 Enter the message to be decoded: !dlroW olleH
 Decoded message: Hello World!

 Please choose an option:
 1. Encode a message.
 2. Decode a message.
 3. Exit.
 Choice: 3

 Goodbye! Keep those secrets safe!


 Example 2:

 Welcome to the Secret Encoder and Decoder!
 Please choose an option:
 1. Encode a message.
 2. Decode a message.
 3. Exit.
 Choice: 1

 Enter your message to be encoded: Java is fun!
 Encoded message: !nuf si avaJ

 Please choose an option:
 1. Encode a message.
 2. Decode a message.
 3. Exit.
 Choice: 2

 Enter the message to be decoded: !nuf si avaJ
 Decoded message: Java is fun!

 Please choose an option:
 1. Encode a message.
 2. Decode a message.
 3. Exit.
 Choice: 2

 Enter the message to be decoded: programming
 Decoded message: gnimmargorp

 Please choose an option:
 1. Encode a message.
 2. Decode a message.
 3. Exit.
 Choice: 3

 Goodbye! Keep those secrets safe!
 */
