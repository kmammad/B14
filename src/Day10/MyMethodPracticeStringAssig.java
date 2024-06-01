package Day10;

import java.util.Scanner;

public class MyMethodPracticeStringAssig {

    public static void main(String[] args) {

        // 2. Write the main method logic.
        System.out.println("Enter the first celebrity's name: ");
        String name1 = new Scanner(System.in).nextLine();

        System.out.println("Enter the second celebrity's name: ");
        String name2 = new Scanner(System.in).nextLine();

        String mixedName = "Tabloids are going to love this: " + mixNames(name1, name2) + "!";

        System.out.println(mixedName);

    }

    // 1. Create your method here

    public static String mixNames(String name1, String name2) {


        int length1 = name1.length();
        int length2 = name2.length();

        String evenName = name1.substring(0, length1 / 2) + name2.substring(length2 / 2);
        String oddName = name1.substring(0, length1 / 2) + name2.substring(length2 / 2 + 1);

        String mixedName;

        if (length1 % 2 == 0 || length2 % 2 == 0) {
            mixedName = evenName;
        } else {
            mixedName = oddName;
        }

return mixedName;


    }



}
