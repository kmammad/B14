package Assignmenents;

public class A8_CreditCardGenerator {

    public static void main(String[] args) {

        // TESTS

//String randomNumber = "" + getRandomCreditCardNo();


        System.out.println(getRandomCreditCardNo(1));
        System.out.println(getRandomCreditCardNo(2));
        System.out.println(getRandomCreditCardNo(3));
        System.out.println(getRandomCreditCardNo(4));
        System.out.println(getRandomCreditCardNo(0));
        System.out.println(getRandomCreditCardNo(2330));
        System.out.println(getRandomCreditCardNo(-23));

    }

    public static String getRandomCreditCardNo(int number){

        // implement the method here

        String str;

        long randomNumber15 = (long)(Math.random()*900000000000000L + 100000000000000L);
        long randomNumber14 = (long)(Math.random()*90000000000000L + 10000000000000L);

        switch (number){
            case 1:
                str = "3" + randomNumber14;
                break;
            case 2:
                str = "4" + randomNumber15;
                break;
            case 3:
                str = "5" + randomNumber15;
                break;
            case 4:
                str = "6" + randomNumber15;
                break;
            default:
                return "0";

        }

        return str;

    }

}

/**
Create a method called **getRandomCreditCardNo()** that generates a random credit card number for one of the 4 credit card companies: American Express, Visa, Mastercard and Discover and returns it as a **String**.

Your method should have an integer parameter that represents the credit card company:

        1 -> American Express (i.e, if you pass 1 as an argument, it needs to return random American Express card number. )
   2 -> Visa
   3 -> Mastercard
   4 -> Discover

If the argument is any other number, your method should simply return 0.

Credit card number generation rules:

        -American Express must start with 3 and must be 15 digits long. e.g. 345672363622649

        -Visa must start with 4 and must be 16 digits long. e.g. 4456723636226497

        -Mastercard must start with 5 and must be 16 digits long. e.g. 5456723636226494

        -Discover must start with 6 and must be 16 digits long. e.g. 6456723636226491


Examples:

getRandomCreditCardNo(1)  ->  345672363622649
getRandomCreditCardNo(2)  ->  4456723636226497
getRandomCreditCardNo(3)  ->  5456723636226494
getRandomCreditCardNo(4)  ->  6456723636226491
getRandomCreditCardNo(0)  ->  0
getRandomCreditCardNo(1000)  ->  0
getRandomCreditCardNo(-23)  ->  0
     */






