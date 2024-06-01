package Day9;

public class StringDemo {

    public static void main(String[] args) {


        // myString myString = new MyString();

//    String str = new String(); // create an empty string object using the traditional object creation syntax

        // String str2 = new String("hello");

        String str = "hello"; // might look like primitive but it is object

        int numOfChars = str.length();

        System.out.println(numOfChars); // returns number of characters in the original String hello = 5

        System.out.println("hello".length()); //rare

        System.out.println("".length()); // return 0 as empty string is a valid string

        //index is a position of a character, in java indexes start from 0

        str.charAt(0);

        System.out.println(str.charAt(0)); // returns "h" first character is 0, length - 1 is giving last index

        // space is also considered character

        char ch = str.charAt (0);
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(4)); //returns last index

        int strsLength = str.length();

        System.out.println(str.charAt(strsLength-1)); // returns last index of any string can be dynamically or programmaticaly


        System.out.println("hello".concat("world"));

        String st1 = "Hi";
        String st2 = " Universe";

        String st3 = st1.concat(st2); // simply calling a method on a String does NOT the string's value

        System.out.println(st3);


        //trim is useful if you want to get rid of preceding whitespace characters lik '', \t, \f, \r, or \n
        System.out.println("   \n\n a string   with spaces\n\t       ".trim());













    }







}
