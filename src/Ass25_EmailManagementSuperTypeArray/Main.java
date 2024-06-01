package Ass25_EmailManagementSuperTypeArray;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("******************** DUOTECH EMAIL MANAGEMENT APPLICATION ********************");
        System.out.println("------------------------------------------------------------------------------");

        // Implement the EMA application logic here

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many emails would you like to generate today?: ");

        int noOfEmails = scanner.nextInt();

        Email [] emails = new Email [noOfEmails];

        for (int i = 0; i < noOfEmails; i++) {

            System.out.println("Creating the email #" + (i+1));
            System.out.println("Choose the type:\n1.Student\n2.Staff");

            int type = scanner.nextInt();
            scanner.nextLine();

            if (type == 1) {
                System.out.print("First Name: ");
                String firstName = scanner.nextLine();
                System.out.print("Last Name: ");
                String lastName = scanner.nextLine();
                System.out.print("Batch No: ");
                int batchNo = scanner.nextInt();
                emails[i] = new StudentEmail(firstName, lastName, batchNo);
                System.out.println("An email has been created for Student");
                System.out.println("-------------------------------------------");
            }
            else if (type == 2)
            {
                System.out.print("First Name: ");
                String firstName = scanner.nextLine();
                System.out.print("Last Name: ");
                String lastName = scanner.nextLine();
                System.out.println("Department ID: \n1. Accounting\n2. Sales\n3. Marketing\n4. Instructors");
                int departmentId = scanner.nextInt();
                if (departmentId >= 1 && departmentId <= 4) {
                    emails[i] = new StaffEmail(firstName, lastName, departmentId);
                    System.out.println("An email has been created for Staff");
                    System.out.println("-------------------------------------------");
                } else {
                    System.out.println("Invalid department");
                    i--;
                }
            }
            else
            {
                System.out.println("Invalid selection");
                i--;
            }

        }
        System.out.println("");
        System.out.println("Here are the emails that have been created:");
        System.out.println("");

        for (Email email : emails) {
            email.generateEmail();
            email.generatePassword();
            System.out.println(email.toString());
            System.out.println("************************************************");
        }


        System.out.println("THANK YOU FOR USING DUOTECH EMA! GOODBYE!");
    }
}
