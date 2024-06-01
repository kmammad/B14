package Ass21_FuelEfficiencyTracker;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Implement the main method logic here

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Car Fuel Efficiency Tracker!");
        System.out.println("Would you like to start with default values or enter initial values for your car?\n1. Default Values\n2. Enter Initial Values");


        while(true){

            System.out.print("Enter choice (1 or 2)");
            int choice = scanner.nextInt();

            if(choice < 0 || choice > 2){
                System.out.print("Invalid value. Please enter 1 or 2.");
                continue;
            }

            else if (choice == 1){
                Car car = new Car();


                int option;

                do {

                    System.out.println("------------------------------------------------");
                    System.out.println("""
              ---- Car Fuel Efficiency Tracker Menu ----
               1. Log Fuel Purchase
               2. Record Distance Driven
               3. View Fuel Efficiency
               4. Exit
                                 """);

                    System.out.print("\nSelect an option: ");
                    option = scanner.nextInt();

                    switch(option) {
                        case 1:
                            System.out.print("Enter the amount of fuel purchased (in gallons): ");
                            double fuel1 = scanner.nextDouble();
                            car.logFuelPurchase(fuel1);
                            break;
                        case 2:
                            System.out.print("Enter the distance driven since last update (in miles): ");
                            double miles1 = scanner.nextDouble();
                            car.recordDistance(miles1);
                            break;
                        case 3:
                            car.getEfficiencyDetails();
                            break;
                        case 4:
                            System.out.println("Thank you for using the Car Fuel Efficiency Tracker. Goodbye!");
                            break;
                        default:
                            System.out.println("Invalid option. Choose betwee 1 and 4");
                            option = scanner.nextInt();
                    }

                } while (option != 4);

                break;

            }

            else {

                System.out.print("Please enter the initial distance driven (in miles): ");
                double miles = scanner.nextDouble();

                System.out.print("Please enter the initial amount of fuel used (in gallons): ");
                double fuel = scanner.nextDouble();

                Car car = new Car(miles, fuel);


                int option;

                do {
                    System.out.println("------------------------------------------------");
                    System.out.println("""
              ---- Car Fuel Efficiency Tracker Menu ----
               1. Log Fuel Purchase
               2. Record Distance Driven
               3. View Fuel Efficiency
               4. Exit
                                 """);
                    System.out.print("\nSelect an option: ");
                    option = scanner.nextInt();

                    switch(option) {
                        case 1:
                            System.out.print("Enter the amount of fuel purchased (in gallons): ");
                            double fuel2 = scanner.nextDouble();
                            car.logFuelPurchase(fuel2);
                            break;
                        case 2:
                            System.out.print("Enter the distance driven since last update (in miles): ");
                            double miles2 = scanner.nextDouble();
                            car.recordDistance(miles2);
                            break;
                        case 3:
                            car.getEfficiencyDetails();
                            break;
                        case 4:
                            System.out.println("Thank you for using the Car Fuel Efficiency Tracker. Goodbye!");
                            break;
                        default:
                            System.out.println("Invalid option. Choose betwee 1 and 4");
                            option = scanner.nextInt();
                    }

                } while (option != 4);

                break;

            }

        }



    }
}
