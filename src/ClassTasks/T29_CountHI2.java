package ClassTasks;

import java.util.*;
public class T29_CountHI2 {

    public static void main(String[] args) {

        //test here


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the original word");
        String original = scanner.nextLine();

        System.out.println("Enter the word to searched");
        String searched = scanner.nextLine();


        System.out.println(count(original, searched));

    }

    //method here
    public static int count (String original, String searched ) {

        int count = 0;

        for (int i = 0; i <= original.length()-searched.length(); i++){

            String substring = original.substring (i, i + searched.length());

            if (substring.equals(searched)){
                count++;
            }

        }

        return count;
    }

}
/**
 *Create a method that takes 2 strings, one - the string we are searching from, the other one - the substring we are looking for within the other string.
 *
 *
 * count("HiHelloHiHelloHelloHi", "Hi") -> 3
 * count("HiHelloHiHelloHelloHi", "Hello") -> 3
 * count("HiHelloHiHelloHelloHi", "hola") -> 0
 *
 * count("hhhhhh", "hh") -> 5
 *
 * count("hi how is it going so far? is it ok?", "is") -> 2
 * count("hi how is it going so far? is it ok?", "how") -> 1
 * count("hi how is it going so far? is it ok?", "it") -> 2
 * count("hi how is it going so far? is it ok?", "going") -> 1
 *
 */
