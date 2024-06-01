package Day10;

import java.util.Scanner;

public class FullNameSeparator {

    public static void main(String[] args) {

        System.out.println("Please enter your full name (e.g. John Doe):  ");
        String fullName = new Scanner(System.in).nextLine();

        int indexOfSpace = fullName.indexOf(' ');

String firstName = fullName.substring(0, indexOfSpace);
String lastName = fullName.substring(indexOfSpace + 1);
        System.out.println(" Your formatted name " + lastName + "," + firstName);




    }



}
