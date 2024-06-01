package day2;

import java.util.Scanner; // import statement must appear before class statement and after package statement
import java.util.SortedMap;

import day1.OnlineStudent;
import jdk.swing.interop.SwingInterOpUtils;

//String str; is from import java.lang.String;
// to import every class in the package import java.util.*;

public class FullNameDisplay {

    public static void main(String[] args) {

        // import statement is used for importing classes that are outside of the current package to make them available in your current package
        // syntax for import -> packageName.ClassName

        // Enter your first name: John
        // Enter your last name: Doe
        // Your Full Name: Doe, John

        // Student student = new Student();
        // OnlineStudent onlineStudent = new OnlineStudent();

        Scanner scanner = new Scanner(System.in); // need to import this class - scanner class located in specific package java.util

        System.out.print("Enter your first name");
        String first = scanner.nextLine(); //gets a nextLine will grab double names separated with space, prevents from going to the next question
        // no need to callout next since it is the first time use

       // System.out.println("You entered: " + first);

        System.out.print("Enter your your last name ");
        String last = scanner.next(); //gets a single word gets a single word

        System.out.print("Enter your aga ");
        int age = scanner.nextInt();

        System.out.print("Enter your phone no: ");
        long phoneNo = scanner.nextLong();

        System.out.print("Are you single? (true/false) ");
        boolean isSingle = scanner.nextBoolean();

        System.out.print("Enter your address: ");
        scanner.nextLine(); //add this before the actual nextLine call/method (this moves the cursor to the next line)
        String address = scanner.nextLine();

        System.out.println("The full name: " + last + ", " + first);
        System.out.println("Your details:" );
        System.out.println("Age:" + age);
        System.out.println("Phone:" + phoneNo);
        System.out.println("Single:" + isSingle);
        System.out.println("Address:" + address);




    }
}
