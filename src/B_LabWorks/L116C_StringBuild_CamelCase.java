package B_LabWorks;

/**
 * Given a string s that contains words with a mixture of lowercase and uppercase letters, create a method that converts the string to a "camel case" format.
 *
 * Consider the following rules for converting the string to camel case:
 *
 * -The first word should be in lowercase.
 * -All subsequent words should be in lowercase, except for the first letter which should be in uppercase.
 *
 * Use StringBuilder to implement the method logic.
 *
 * Examples:
 *
 * "the quick BROWN fox" -> "theQuickBrownFox"
 * "hello world" -> "helloWorld"
 * "HELLO WORLD" -> "helloWorld";
 * "heLLo biG WOrLD" -> "helloBigWorld"
 */

public class L116C_StringBuild_CamelCase {
    public static void main(String[] args) {

        System.out.println(toCamelCase("the quick BROWN fox")); //"theQuickBrownFox"
        System.out.println(toCamelCase("hello world")); //"helloWorld"
        System.out.println(toCamelCase("HELLO WORLD")); //"helloWorld"
        System.out.println(toCamelCase("heLLo biG WOrLD")); //"helloBigWorld"
    }
    public static String toCamelCase(String s){

        StringBuilder sb = new StringBuilder(s.toLowerCase());

        char space = ' ';

        char firstUpper = Character.toUpperCase(sb.charAt(0));

        sb.setCharAt(0, firstUpper);

        for (int i = 1; i < sb.length(); i++){
            if (sb.charAt(i) == space){
                char nextUpper = Character.toUpperCase(sb.charAt(i+1));
                sb.setCharAt(i, nextUpper);
                sb.deleteCharAt(i + 1);
            }
        }

        return sb.toString();
    }
}
