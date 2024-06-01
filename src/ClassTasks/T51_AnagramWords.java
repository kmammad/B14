package ClassTasks;

import java.util.Arrays;

public class T51_AnagramWords {
    public static void main(String[] args) {

        //TESTS
        System.out.println(isAnagram("abca","caba")); // true
        System.out.println(isAnagram("abc","abb")); // false
        System.out.println(isAnagram("night","thing")); // true
        System.out.println(isAnagram("cola","loco")); // false

    }


    public static boolean isAnagram(String str1, String str2){

        char [] arr1 = str1.toCharArray();
        char [] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals (arr1, arr2);

    }

}
/**
 *
 *Write a method that checks if a string is anagram of another string, that is, it is built out of the same letters as another string:
 *  Examples:
 *     isAnagram("abca","caba"); -> true
 *     isAnagram("abc","ab"); -> false
 *     isAnagram("abc","abb"); -> false
 *     isAnagram("listen","silent"); -> true
 *     isAnagram("bored","robed"); -> true
 *     isAnagram("night","thing"); -> true
 *     isAnagram("stressed","desserts"); -> true
 *     isAnagram("cola","loco"); -> false
 *     isAnagram("cola","loca"); -> true
 *
 *
 */
