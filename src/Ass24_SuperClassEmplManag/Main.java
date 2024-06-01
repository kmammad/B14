package Ass24_SuperClassEmplManag;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Manager[] managers = new Manager[2];
        // Initially an array will have null values

        managers[0] = new Manager("John Doe", 100000, 5, 5000);
        managers[1] = new Manager("Alice Lee", 150000, 7, 10000);

        for (Manager manager : managers) {
            System.out.println(manager.toString() + ", Total Pay: $" + manager.getPaid());
        }

        Programmer[] programmers = new Programmer[2];
        // Initially an array will have null values

        programmers[0] = new Programmer("John Boit", 100000, 3, "Java");
        programmers[1] = new Programmer("Sarah Connor", 150000, 5, "Python");

        for (Programmer programmer : programmers) {
            System.out.println(programmer.toString() + ", Total Pay: $" + programmer.getPaid());
        }
    }
}

