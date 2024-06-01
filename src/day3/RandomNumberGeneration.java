package day3;

public class RandomNumberGeneration {

    // simulates coin toss, or dice

    public static void main(String[] args) {

        double randomValue = Math.random(); // default usage of random gives us double integer

        System.out.println(randomValue);

        //Random integer
//        (int)(Math.random() * 10 -. returns a random integer between o and 9
//         50 + (int)(Math.random() * 50) -> returns a random integer between 50 and 99
//        General rule to generate any random number:
        // a + Math.random() * b -> returns a random number between a and a+b, excluding a + b

        int randomInteger = 0 + (int)(Math.random() * 10);

        System.out.println("Random number: " + randomInteger);

        System.out.println(5 + (int)(Math.random() * 6)); // 5 to 10
        System.out.println(50 + (int)(Math.random() * 101)); // 50 to 150

    // Generate a random 2 digit numbers

        System.out.println(10 + (int)(Math.random() * 90)); // 10 to 99

        System.out.println(1000 + (int)(Math.random() * 1000)); // 1000 to 1999



    }
}
