package ClassTasks;

import java.util.*;

public class T07b_MethodParameter {
    public static void main(String[] args) {


        //call your method here

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first double parameter: ");

        double num1 = scanner.nextDouble();

        System.out.println("Enter the second double parameter: ");
        double num2 = scanner.nextDouble();

        calculate(num1, num2);

    }



    //create your method here

    public static void calculate(double num1, double num2){

        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
        System.out.println("Substraction: " + (num1 - num2));
        System.out.println("Modulo: " + (num1 % num2));

    }




}

/**
 * Create a method called calculate() that has 2 double parameters and displays the result of all arithmetic operators on those 2 values.
 *
 *
 * Example 1:
 *
 *     calculate(10.0, 5.0) ->
 *
 *       Addition: 15.0
 *       Multiplication: 50.0
 *       Division: 2.0
 *       Subtraction: 5.0
 *       Modulo: 0.0
 *
 * Example 1:
 *
 *     calculate(6.0, 4.0) ->
 *
 *       Addition: 10.0
 *       Multiplication: 24.0
 *       Division: 1.5
 *       Subtraction: 2.0
 *       Modulo: 2.0
 *
 */