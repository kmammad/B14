package Day5;

import java.sql.SQLOutput;
import java.util.Scanner;

import java.util.Scanner;

public class MethodArguments {

    public static void main(String[] args) {

        printUpperCase('s');

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter your first and last names and I will print your full name in a special format");

        String f = scanner.next();
        String l = scanner.next();

        printFullName(f,l);


    }

    public static void printFullName(String first, String last){

        System.out.println("Full name: " + last + ", " + first);

    }

    // create a method that converts a lowercase char into its uppercase char

    public static void printUpperCase(char lowercase){

        System.out.println((char)(lowercase - 32));

    }

}
