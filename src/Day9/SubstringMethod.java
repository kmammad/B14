package Day9;

import java.sql.SQLOutput;
import java.util.SortedMap;

public class SubstringMethod {

    public static void main(String[] args) {

        // substring method returns a new String with portion of the previous string

        String str = "Welcome to Java";

       String portion = str.substring(0); // starts with given index till the end

        System.out.println(portion);


      String subStr = str.substring(0,2);//uses start index, but never included to the last index

        System.out.println(subStr);


        String myStr = "Suggestion and complaints";

        System.out.println(myStr.substring(0,3));

        // get the last 2 characters
        System.out.println(myStr.substring(myStr.length()-2)); // returns ts

        String word = "Intelligence";
        System.out.println(word.substring(word.length()/2)); // returns the exact Last half

        System.out.println(word.substring(0, word.length()/2)); // returns the exact First half


        //application in real world

        String price = "$123.34 USD";

        String numericPart = price.substring(1, price.length()-4);

        System.out.println(numericPart); // returns 123,34




    }
}
