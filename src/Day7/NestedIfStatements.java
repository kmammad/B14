package Day7;

public class NestedIfStatements {

    public static void main(String[] args) {

        int number = 15;

        // spaghetti code is not recommended, bad code hard to read

        if (number >= 0) {
            System.out.println("Positive");
            if (number % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }

        } else {

            System.out.println("Negative");

            if (number % 3 == 0) {
                System.out.println("Divisible by 3");
            }

        }
    }
}
