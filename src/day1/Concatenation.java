package day1;

public class Concatenation {

    public static void main(String[] args) {

        String words = "Hello" + "World";

        System.out.println("Hello" + "World");
        System.out.println("Hello" + 100 + "Hi" + true + '$' + 4.5);

        double radius = 12.1;

        System.out.println("The radius is " + radius + " The Radius squared is " + (radius * radius)); // concatenation string with variables

        // if two sizes of a plus are numbers - performs addition,
        // if one size is a string then they will be merged, concatenation happens

        System.out.println(1 + 1 + 1 + "1"); // will make 31 not 4

        System.out.println("1" + 1 + 1 + 1); // will make 1111, as the first wast string to concatenate

        //string plus anything result in string

        System.out.println(1 + 1 + "1" + 1 + 1); // 2111

        System.out.println(1 + 1 + "1" + (1 + 1) ); // 212

        System.out.println(" " + 1 + 1 + 1 + 1); // start with empty string to convert outcome to string. Space is considered a character

        String num = "" + (4+5); //to have 9 not 45

    }


}
