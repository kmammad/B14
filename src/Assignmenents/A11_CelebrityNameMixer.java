package Assignmenents;

import java.util.*;

public class A11_CelebrityNameMixer {

    public static void main(String[] args) {

        // 2. Write the main method logic.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first name ");
        String name1 = scanner.nextLine();

        System.out.println("Enter the second name ");
        String name2 = scanner.nextLine();

        String mixedName = "Tabloids are going to love this: " + mixNames(name1, name2) + "!";

        System.out.println(mixedName);

    }


    // 1. Create your method here

    public static String mixNames(String name1, String name2) {

        int length1 = name1.length();
        int length2 = name2.length();

        String evenName = name1.substring(0, length1/2) + name2.substring(length2/2);
        String oddName = name1.substring(0,length1/2) + name2.substring(length2/2 + 1);

        String mixedName;

        if (length1 % 2 == 0 || length2 % 2 == 0) {
            mixedName = evenName;

        } else {
            mixedName = oddName;
        }

        return mixedName;

    }

}
/** Celebrity Name Mixer

 Background:
 Hollywood is going through a trend where celebrities combine their names when they start dating, like "Brangelina" (Brad Pitt and Angelina Jolie). It's all the rage in the tabloids! Your job is to create a program that helps gossip magazines quickly generate these trendy couple names.

 Create a program that takes the names of two celebrities and generates a single "celebrity couple" name by combining parts of both names.

 Steps:

 1. Create a method called mixNames(String name1, String name2):
 This method combines the first half of name1 with the second half of name2 to create the trendy couple name and returns it.
 Rules for obtaining the half of the names:
 - if any of the names has even number of characters, obtain the exact half:
 First celebrity: **Jenn**ifer
 Second celebrity: Rob**ert**
 Mixed: Jennert
 - if any of the names has odd number of characters, obtain the half before(for the first input) or after(for the second input) the midpoint:
 First celebrity: **Jes**sica
 Second celebrity: Brad**ley**
 Mixed: Jesley

 3. In the main method:
 Prompt the user to enter two celebrity names.
 Call the mixNames method to obtain the mixed name.
 Display the generated celebrity couple name like:
 "The tabloids are going to love this: [MIXED_NAME]!"



 Example Output 1:

 Enter the first celebrity's name: Bruce
 Enter the second celebrity's name: Drew

 The tabloids are going to love this: Brew!



 Example Output 2:

 Enter the first celebrity's name: Russell
 Enter the second celebrity's name: Angelina

 The tabloids are going to love this: Ruslina!


 Example Output 3:

 Enter the first celebrity's name: Leonardo
 Enter the second celebrity's name: Jennifer

 The tabloids are going to love this: Leonifer!
   */