package ClassTasks;

public class T06_MagicCharacterRevealer {

    public static void main(String[] args) {


        //Write your code here

        char ch = (char)(Math.random()*26 + 'A');

        int ch1 = (int)(ch);

        double sqRt = Math.sqrt(ch1);

        char chAdd5 = (char)(ch1+5);

        int ch1Pow = (int) (Math.pow(ch1,4));

        char ch3 = (char)(ch1Pow);

        System.out.println("Randomly Generated Uppercase Character: " + ch);

        System.out.println("ASCII Value: " + ch1);

        System.out.println("Square Root of ASCII value: " + sqRt);

        System.out.println("Character transformed by adding 5: " + chAdd5);

        System.out.println("Character transformed by raising to the 4th power: " + ch3);




    }
}

/**
 Magic Character Revealer

 Create a Java program that generates a random character and performs some mathematical operations on it.

 Task Description:

 1. Generate a Random Character:

 Use the Math.random() method to generate a random uppercase letter character.

 2. Perform Mathematical Operations:

 Use the Math class methods to perform the following operations on the ASCII value of the generated character:
 - square root of its ASCII value
 - transform the character by adding 5
 - transform the character by raising the ASCII value to the power of 4

 3. Display Results:

 Display the original character, the ASCII value, and the results of the mathematical operations.


 EXAMPLE:

 Randomly Generated Uppercase Character: C
 ASCII Value: 67
 Square Root of ASCII Value: 8.18535277187245
 Character transformed by adding 5: H
 Character transformed by raising to the 4th power:筑

 */
