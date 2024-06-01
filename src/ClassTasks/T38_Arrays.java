package ClassTasks;

import java.util.Arrays;

public class T38_Arrays {

    public static void main(String[] args) {

        int sum = 0;

        // Create an integer array with size 100

        int [] numbers  = new int[100];

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = (int)(Math.random()*25 + 0);
            sum = sum + numbers [i];
        }
        // assign to each element of the array a random number between 0-25

        // Print the content of the array either with for loop or Arrays.toString()
        System.out.println(Arrays.toString(numbers));

        System.out.println(" ");

        System.out.println("Sum is: " + sum);

        System.out.println(" ");

        System.out.println("Average is: " + sum/numbers.length);

        // Get the sum of all numbers and their average and print them.


    }

}
