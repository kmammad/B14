package Day9;

import java.util.Scanner;

public class UsernameGenerator {

// convert both names to lowercase.
// extract the first three letters of the firstname and the first three letters of the last name.
// Concatenate the extracted letters with a predefined symbol (e.g. "_) in between.
// Append a random 3 digit number (e.g. "007") to the end of the generated string to make the username unique
public static void main(String[] args) {

    System.out.println("Please provide your First Name ");
    String firstName = new Scanner(System.in).next();

    System.out.println("Please provide your Last Name   ");
    String lastName = new Scanner(System.in).next();

    String fullName = firstName + " " + lastName;

    String firstNameF3 = (firstName.substring(0, 3)); // returns ts
    String lastNameF3 = (lastName.substring(0, 3)); // returns ts

String firstLastConcat = firstNameF3.concat(("_").concat(lastNameF3));

String firstlast007 = firstLastConcat;

int num1 = (int)(Math.random()*1000+100);


System.out.println(firstLastConcat + num1);





}


}
