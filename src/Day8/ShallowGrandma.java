package Day8;

import java.util.Scanner;

public class ShallowGrandma {

    public static void main(String[] args) {

        System.out.println("What is his age: ");
        double age = new Scanner(System.in).nextDouble();

        System.out.println("What is his income: ");
        double income = new Scanner(System.in).nextDouble();

        System.out.println("Rate his looks from 1 to 10: ");
        double look = new Scanner(System.in).nextDouble();


        boolean isApproved = (age >= 25 && age <= 40) && (income > 500 || look > 8.5);

        if(isApproved) {
            System.out.println("The suitor is Grandma-approved ");
        }else{
            System.out.println("Sorry, this one's not getting past Grandma ");
        }


    }


}
