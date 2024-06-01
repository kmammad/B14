package BudgetTracker;

import java.util.Scanner;

import java.util.Scanner;

public class Main {

//    ---- Menu ----
//    1. Add Income
//    2. Log Expense
//    3. View Budget Details
//    4. Exit
    //Enter your choice: 1
    //Enter the income amount: 1000
    //Income added.

    public static void main(String[] args) {


        System.out.println("Welcome to BudgetTracker!");

        Scanner scanner = new Scanner(System.in);

        BudgetTracker budgetTracker = new BudgetTracker();

        while(true){

             System.out.println("""
                        ---- Menu ----
                        1. Add Income
                        2. Log Expense
                        3. View Budget Details
                        4. Exit
                        """);

             System.out.print("Enter your choice: ");

              int choice = scanner.nextInt();

           switch (choice){
           case 1:
             System.out.print("Enter the income amount:");
             double income = scanner.nextDouble();
             budgetTracker.addIncome(income);
             System.out.println("Income added.");
             break;
            case 2:
             System.out.print("Enter the expense amount:");
             double expense = scanner.nextDouble();
             budgetTracker.logExpense(expense);
             System.out.println("Expense logged.");
             break;
            case 3:
             budgetTracker.calculateNetBalance();
             System.out.println("Current Income: " + budgetTracker.getTotalIncome());
             System.out.println("Total Expenses: " + budgetTracker.getTotalExpenses());
             System.out.println("Net Balance: " + budgetTracker.getNetBalance());
             break;
            case 4:
             System.out.println("Thank you for using the Personal Budget Tracker. Goodbye!");
             System.exit(0);
            default:
             System.out.println("Invalid choice. Please choose the correct option.");
             break;
           }

        }

    }

}
