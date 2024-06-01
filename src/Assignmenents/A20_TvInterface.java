package Assignmenents;

import java.util.Scanner;

public class A20_TvInterface {
    public static void main(String[] args) {

        //Implement the main method logic here
        A20_TV tv1 = new A20_TV();

        System.out.println("TV Remote:\n(1) Power Toggle.\n(2) Volume Up\n(3) Volume Down\n(4) Channel Up\n(5) Channel Down\n(6) Set Channel\n(7) Display Status\n(8) Exit");

        Scanner scanner = new Scanner(System.in);

        int choice;

        do {
            System.out.print("\nSelect an option: ");
            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    tv1.powerToggle();
                    break;
                case 2:
                    tv1.volumeUp();
                    break;
                case 3:
                    tv1.volumeDown();
                    break;
                case 4:
                    tv1.channelUp();
                    break;
                case 5:
                    tv1.channelDown();
                    break;
                case 6:
                    System.out.print("Enter the channel number: ");
                    int newChannel = scanner.nextInt();
                    tv1.setChannel(newChannel);
                    break;
                case 7:
                    tv1.displayStatus();
                    break;
                case 8:
                    System.out.println("Turning off the TV and exiting.");
                    break;
                default:
                    System.out.println("Invalid option. Select between 1 and 8.");
                    choice = scanner.nextInt();
            }
        } while (choice != 8);
    }


}
/**
 *
 *
 */
