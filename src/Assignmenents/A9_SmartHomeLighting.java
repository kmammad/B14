package Assignmenents;

import java.util.*;

public class A9_SmartHomeLighting {

    public static void main(String[] args) {


        // Write the logic here in the main method

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the current time? (Enter in 24-hour format, e.t. 13 for 1pm): ");

        int time = scanner.nextInt();

        System.out.println("Are there occuppants in the room? (yes/no): ");

        String str = scanner.next();


        Boolean peopleYes = str.equals("yes");

        boolean day = time >= 6 && time < 18;
        boolean night = (time >= 18 & time <= 23) || (time >= 0 && time < 6);



        if (day && peopleYes) {
            System.out.println("Set lights to 'Natural Mode'.");

        } else if (day && !peopleYes) {
            System.out.println("Turn off the lights");

        } else if (night && peopleYes) {
            System.out.println("Set lights to 'Ambient Mode'.");

        } else {

            System.out.println("Set lights to 'Security Mode'.");
        }

//System.out.println(time + occupants);

    }

}

/**"Smart Home Lighting Control"** 💡🏠

In this task, you will develop a Java program that simulates a smart home lighting system which adjusts the lighting based on various factors like time of day and the presence of occupants.

        **Task Description:**

The smart lighting system has two primary factors to consider:

Time of Day:
Day (6am - 6pm)
Night (6pm - 6am)

Presence of Occupants:
Occupants Present
No Occupants

Based on the combination of these factors, the system will decide the lighting mode.

        Steps:

        1. User Input.
Ask the user about the current time and whether there are occupants in the room:
        "What is the current time? (Enter in 24-hour format, e.g., 13 for 1pm)"
        "Are there occupants in the room? (yes/no)"

        2. Implement the Lighting Control logic using compound conditional statements.
Adjust the lights based on the conditions:

If it's day and occupants are present, "Set lights to 'Natural Mode'."
If it's day and no occupants are present, "Turn off the lights."
If it's night and occupants are present, "Set lights to 'Ambient Mode'."
If it's night and no occupants are present, "Set lights to 'Security Mode'."

        3. Display Lighting Mode:
Based on the conditions, display the chosen lighting mode.


        **Example output 1:**
What is the current time? (Enter in 24-hour format, e.g., 13 for 1pm): 10
Are there occupants in the room? (yes/no): yes
Set lights to ‘Natural Mode’.

        **Example output 2:**
What is the current time? (Enter in 24-hour format, e.g., 13 for 1pm): 13
Are there occupants in the room? (yes/no): no
Turn off the lights.

        **Example output 3:**
What is the current time? (Enter in 24-hour format, e.g., 13 for 1pm): 22
Are there occupants in the room? (yes/no): yes
Set lights to ‘Ambient Mode’.

        **Example output 4:**
What is the current time? (Enter in 24-hour format, e.g., 13 for 1pm): 23
Are there occupants in the room? (yes/no): no
Set lights to ‘Security Mode’.
 */