package B_LabWorks;

public class L116B_StringBuild_AlternateCharacters {

    /**
     * Given two strings s1 and s2, return a new string that interleaves the characters of the input strings.
     * Use StringBuilder to implement the method.
     *
     * Interleaving means alternating the characters of the two input strings, starting with the first character of the first string. If one string is longer than the other, the remaining characters of the longer string should be appended to the end of the output string.
     *
     * For example, if s1 is "abc" and s2 is "123", the method should return "a1b2c3".
     *
     * Examples:
     *
     *
     *  "abc", "def"  ->  "adbecf"
     *  "hello", "world"  ->  "hweolrllod"
     *  "a", "bcdefg"  ->  "abcdefg"
     *  "abc", ""  ->  "abc"
     *
     */


    public static void main(String[] args) {

        System.out.println(interleaveStrings("abc", "def"));//"adbecf"
        System.out.println(interleaveStrings("hello", "world"));//"hweolrllod"
        System.out.println(interleaveStrings("a", "bcdefg"));//"abcdefg"
        System.out.println(interleaveStrings("abc", ""));//"abc"


    }


    public static String interleaveStrings(String s1, String s2) {
        // Implement your solution using StringBuilder here

        char [] arr1 = s1.toCharArray();
        char [] arr2 = s2.toCharArray();

        StringBuilder sb = new StringBuilder();

        int length = Math.max(s1.length(), s2.length());

        for (int i = 0; i < length; i++) {
            if (i < s1.length()){
                sb.append(arr1[i]);
            }
            if (i < s2.length()) {
                sb.append(arr2[i]);
            }
        }


        return sb.toString();
    }
}
