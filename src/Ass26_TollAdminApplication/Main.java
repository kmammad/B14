package Ass26_TollAdminApplication;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many vehicles would you like to calculate toll for?: ");

        int noOfVehicles = scanner.nextInt();

        ArrayList <Vehicle> vehicles = new ArrayList<>();

        for (int i = 0; i < noOfVehicles; i++) {

            System.out.println("\nCalculating the toll for Vehilce #" + (i + 1));
            System.out.println("Choose the vehicle type:\n1.Car\n2.Truck\n3.Police Cruiser");

            int type = scanner.nextInt();

            if (type == 1) {
                System.out.print("Distance traveled: ");
                double distance = scanner.nextDouble();
                System.out.print("Does it have a trailer? (true or false): ");
                boolean trailer = scanner.nextBoolean();
                System.out.print("Is HOV3+ on? (true or false): ");
                boolean hov = scanner.nextBoolean();
                vehicles.add(new Car(distance, trailer, hov));
                vehicles.get(i).calculateToll();
                System.out.println("\nTOLL INFO:\nVehicle          Distance     Toll Amount\n-------------------------------------");
                System.out.println(vehicles.get(i).toString());
            }
            else if (type == 2)
            {
                System.out.print("Distance traveled: ");
                double distance = scanner.nextDouble();
                System.out.print("How many axles?: ");
                int axles = scanner.nextInt();
                vehicles.add(new Truck (distance, axles));
                vehicles.get(i).calculateToll();
                System.out.println("\nTOLL INFO:\nVehicle          Distance     Toll Amount\n-------------------------------------");
                System.out.println(vehicles.get(i).toString());
            }
            else if (type == 3)
            {
                System.out.print("Distance traveled: ");
                double distance = scanner.nextDouble();
                vehicles.add(new PoliceCruiser (distance));
                vehicles.get(i).calculateToll();
                System.out.println("\nTOLL INFO:\nVehicle          Distance     Toll Amount\n-------------------------------------");
                System.out.println(vehicles.get(i).toString());
            }
            else
            {
                System.out.println("Invalid selection");
                i--;
            }

        }

        System.out.println("");
        System.out.println("TOLL INFO ON ALL VEHICLES:\n\nVehicle          Distance     Toll Amount\n-------------------------------------");

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.toString());
        }

        System.out.println("");
        System.out.println("THANK YOU FOR USING THE TAA! GOODBYE!");
    }


}

