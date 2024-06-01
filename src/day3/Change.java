package day3;

public class Change {

    public static void main(String[] args) {

        // 89 -> 3 quarters, 1 dime, 4 pennies

        int change = 89;

        int quarters = change / 25;

        int remainingChange = change % 25;

        System.out.println("Quarters: " + quarters);
        System.out.println("Remaining: " + remainingChange);

        int dimes = remainingChange /10;

        remainingChange = remainingChange %10;

        System.out.println("Dimes: " + dimes);
        System.out.println("Remaining: " + remainingChange);



    }
}
