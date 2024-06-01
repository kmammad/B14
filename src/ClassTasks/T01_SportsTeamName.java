package ClassTasks;

import java.util.*;

public class T01_SportsTeamName {
    public static void main(String[] args) {

        // Write your code here

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of your town: ");

        String town = scanner.nextLine();

        System.out.println("Enter your favorite animal: ");

        String animal = scanner.nextLine();

        System.out.println("Your generated sports team name is: " + town + " " + animal + "s");

    }
}
/**
 Sports Team Name Generator

 Create a simple Java application that takes the user’s town name and their favorite animal using the Scanner class.
 Then, the application will generate a sports team name by combining the two inputs.

 Task Steps:

 - Import Scanner class
 - Create a Scanner object to read the user’s input.
 - Ask the user for the name of their town.
 - Ask the user for their favorite animal.
 - Combine the town name and the animal name and make the combination sound like a sports team name.
 - Print out the generated sports team name to the console.

 EXAMPLE:

 Enter the name of your town:
 Springfield
 Enter your favorite animal:
 Lion
 Your generated sports team name is: Springfield Lions
 */
