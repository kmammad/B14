package Day11;

import java.util.Scanner;

public class IfMess {

    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the current time? (Enter in 24-hour format, e.t. 13 for 1pm): ");

        int time = scanner.nextInt();

        System.out.println("Are there occuppants in the room? (yes/no): ");

        String occupants = scanner.next();

        boolean day = time > 6 && time < 18;
        boolean night = time < 6 && time > 18;



        if(day) {
            System.out.println("Set lights to 'Natural Mode'.");
        } else if(day) {
            System.out.println("Turn off the lights");
        } else if(night) {
            System.out.println("Set lights to 'Ambientn Mode'.");
        } else {
            System.out.println("Set lights to 'Security Mode'.");
        }




    }



}
