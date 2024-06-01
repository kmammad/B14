package Ass28_FinalOOPProject;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("WELCOME TO BANK ACCOUNT MANAGEMENT APPLICATION!");

        // application logic here

        Bank bank = new Bank();

        Scanner scanner = new Scanner(System.in);

        int choice;

        while (true) {
            System.out.println("""
        \nMain Menu: 
        1. Add Savings Account
        2. Add Checking Account
        3. Deposit Money
        4. Withdraw Money
        5. Sort Accounts By Name
        6. Sort Accounts by Account Number
        7. Display Accounts
        8. Save Accounts to File
        9. Load Accounts from File
        0. Exit
                         """);

            System.out.print("\nEnter your choice: ");

            choice = scanner.nextInt();

            switch(choice){

                case 1:
                    System.out.print("\nEnter Account Number: ");
                    while (!scanner.hasNextLong()) {
                        System.out.println("Invalid choice. Please enter a valid number");
                        scanner.next(); // Consume the invalid input
                    }
                    Long savNumber = scanner.nextLong();
                    System.out.print("\nEnter Account Holder Name: ");
                    scanner.nextLine();
                    String savHolder = scanner.nextLine();

                    System.out.print("\nEnter Initial Balance: ");
                    while (!scanner.hasNextDouble()) {
                        System.out.println("Invalid choice. Please enter a valid number");
                        scanner.next(); // Consume the invalid input
                    }
                    Double savBalance = scanner.nextDouble();

                    System.out.print("\nEnter Interest Rate: ");
                    while (!scanner.hasNextDouble()) {
                        System.out.println("Invalid choice. Please enter a valid number");
                        scanner.next(); // Consume the invalid input
                    }
                    Double interestRate = scanner.nextDouble();

                    SavingsAccount savAccount = new SavingsAccount(savNumber, savHolder, savBalance, interestRate);
                    bank.addAccount(savAccount);
                    System.out.println("\nSAVINGS ACCOUNT ADDED SUCCESSFULLY.");
                    break;

                case 2:
                    System.out.print("\nEnter Account Number: ");
                    Long checkNumber = scanner.nextLong();
                    System.out.print("\nEnter Account Holder Name: ");
                    scanner.nextLine();
                    String checkHolder = scanner.nextLine();
                    System.out.print("\nEnter Initial Balance: ");
                    Double checkBalance = scanner.nextDouble();
                    System.out.print("\nOverdraft Limit: ");
                    Double overdraftLimit = scanner.nextDouble();
                    CheckingAccount checkAccount = new CheckingAccount(checkNumber, checkHolder, checkBalance, overdraftLimit);
                    bank.addAccount(checkAccount);
                    System.out.println("\nCHECKING ACCOUNT ADDED SUCCESSFULLY.");
                    break;

                case 3:
                    System.out.print("\nEnter Account Number: ");
                    Long accountNumD = scanner.nextLong();
                    System.out.print("\nEnter Amount to Deposit: ");
                    Double depositAmount = scanner.nextDouble();
                    BankAccount accountD = bank.getAccount(accountNumD);

                    if (accountD != null) {
                        accountD.deposit(depositAmount);
                        System.out.println("\nTHE DEPOSIT WAS SUCCESSFUL.");
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 4:
                    try {
                        System.out.print("\nEnter Account Number: ");
                        Long accountNumW = scanner.nextLong();
                        System.out.print("\nEnter Amount to Withdraw: ");
                        Double withdrawAmount = scanner.nextDouble();
                        BankAccount accountW = bank.getAccount(accountNumW);

                        if (accountW != null) {
                            accountW.withdraw(withdrawAmount);
                            System.out.println("\nTHE WITHDRAWAL WAS SUCCESSFUL.");
                        } else {
                            System.out.println("Account not found.");
                        }
                    } catch (InsufficientFundsException e) {
                        System.out.println("INSUFFICIENT FUNDS: " + e.getMessage());

                    }
                    break;

                case 5:
                    bank.sortAccountsByName();
                    System.out.println("Accounts sorted by name.");
                    break;

                case 6:
                    bank.sortAccountsByAccountNumber();
                    System.out.println("Accounts sorted by account number.");
                    break;

                case 7:
                    System.out.println("---------------ACCOUNTS---------------------------------");
                    bank.viewAccounts();

                    break;

                case 8:
                    System.out.print("\nEnter File Name: ");
                    scanner.nextLine();
                    String fileNameS = scanner.nextLine();
                    bank.writeAccountsToFile(fileNameS);
                    System.out.println("THE ACCOUNTS ARE WRITTEN TO A FILE SUCCESSFULLY.");
                    break;

                case 9:
                    try {
                        System.out.print("\nEnter File Name: ");
                        scanner.nextLine();
                        String fileNameL = scanner.nextLine();
                        bank.readAccountsFromFile(fileNameL);
                        System.out.println("THE ACCOUNTS ARE LOADED FROM A FILE SUCCESSFULLY.");
                    } catch (IOException e){
                        System.out.println("Error in loading accounts from a file" + e.getMessage());
                    }
                    break;

                case 0:
                    System.out.print("\nTHANK YOU FOR USING BANK ACCOUNT MANAGEMENT APPLICATION!");
                    System.exit(0);
                    break;

                default:
                    System.out.print("\nInvalid Choice.");
                    choice = scanner.nextInt();
            }
        }
    }
}
