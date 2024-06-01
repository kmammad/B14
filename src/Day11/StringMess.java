package Day11;

import java.util.*;

public class StringMess {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        generateUsername(firstName, lastName);

    }

    public static void generateUsername(String firstName, String lastName) {

        //implement the method here

        String first = firstName.toLowerCase();
        String last = lastName.toLowerCase();

        int num1 = (int) (Math.random() * 9 + 0);
        int num2 = (int) (Math.random() * 9 + 0);
        int num3 = (int) (Math.random() * 9 + 0);


        String userName;

        if (first.length() < 3 || last.length() < 3) {
            userName = first + "_" + last + num1 + num2 + num3;
        } else {
            String first3 = first.substring(0, 3);
            String lastHalf = last.substring(last.length() / 2 - 1);
            String last3 = lastHalf.substring(lastHalf.length() - 3);
            userName = first3 + "_" + last3 + num1 + num2 + num3;

        }

        System.out.println(userName);

    }
}