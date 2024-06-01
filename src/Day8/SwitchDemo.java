package Day8;

import java.util.Scanner;

public class SwitchDemo {

    public static void main(String[] args) {

     String browser = "safari";

        switch(browser) { //switch expression must yield value of char, byte, short, int or String and must be in parenthesis

            // cannot be relational comparisons like if , if else
            // case hast to be a hardcoded value

            case "chrome":
                System.out.println("Launching Chrome");
                break;

            case "edge":
                System.out.println("Launching Edge");
                break;

            case "safari":
                System.out.println("Launching Safari");
                break;

            default:
                System.out.println("Invalid browser");
                break;
        }

            System.out.println("Please choose one of the following\n1.Deposit Cash.\n2.Deposit Checks.\n3.View Balance.\n4.Exit.");

            int choice = new Scanner(System.in).nextInt();

            switch (choice){
                case 1:
                    System.out.println("Please enter your cash amount .... ");
                    break;
                    case 2:
                    System.out.println("Please enter your check amount .... ");
                    break;
                    case 3:
                    System.out.println("Your current balance is .... ");
                    break;
                    case 4:
                    System.out.println("Good Bye... ");
                default:                                                        // is optional and can be placed anywhere
                    System.out.println("Invalid choice. ");
                    break;                                                      // omitting break will give logical error

            }

            char letter = 'a';  //FallThrough

            switch (letter) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("Vowel");
                    break;
                default:
                    System.out.println("Consonant");
                    break;
            }


            }


        }



