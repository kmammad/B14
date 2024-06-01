package Assignmenents;

import java.util.*;

public class A14_PalindromeChecker {
    public static void main(String[] args) {
        // write the main method logic here

        System.out.println("Welcome to the Palindrome Checker!");

        System.out.print("Enter a string: ");

        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        System.out.println(cleanString(str));

        System.out.println(arrPalindrome(str));

        System.out.println(replaceAllMethod(str));

    }


    //create your methods here

    public static String cleanString(String str){

        String strL = str.toLowerCase();
        String justLet = "";


        for (int i = 0; i < strL.length(); i++){
            char each = strL.charAt(i);
            if (Character.isLetter(each)){
                justLet += each;

            }
        }



        boolean isPalindrome = true;

        for(int j = 0; j < justLet.length()/2; j++){

            if(justLet.charAt(j) != justLet.charAt(justLet.length() - 1 - j)){
                isPalindrome = false;
                break;
            }

        }

        String str2 = "";

        if(isPalindrome){
            str2 = "The string " + "\"" + str + "\" " + "is a palindrome! "  + "(" + justLet + ")";
        } else {
            str2 = "The string " + "\"" + str + "\" " + "is not a palindrome!";
        }

        return str2;
    }


    public static boolean arrPalindrome(String str){

        String lowCase = str.toLowerCase();

        //char[] arr = lowCase.toCharArray();
        String [] arr = lowCase.split("[ ,'.0-9]");

//  System.out.println(Arrays.toString(arr));

        String letters = String.join("",arr);

//  System.out.println(letters);

        char [] arr2 = letters.toCharArray();

        for (int i = 0, j = arr2.length-1; i < j; i++, j--){
            if(arr2[i] != arr2[j]){
                return false;
            }
        }

        return true;
    }

    public static boolean replaceAllMethod (String str) {

        String cleanStr = str.replaceAll("[^a-zA-Z0-9^]","").toLowerCase(); //matches any alphanumeric character, i.e., any letter (either lowercase or uppercase) or any digit.

        int left = 0;
        int right = cleanStr.length()-1;

        while (left < right) {
            if (cleanStr.charAt(left) != cleanStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}

/**
 Palindrome Checker

 A palindrome is a word, phrase, number, or other sequences of characters that reads the same forward and backward (ignoring spaces, punctuation, and capitalization). Examples of palindromic words include "radar", "level", and "rotor".

 Develop a program that prompts the user for a string and checks whether the given string is a palindrome. The program should ignore spaces, punctuation, and should be case insensitive when checking for palindromes.

 Steps:


 1. Create a method named cleanString that:
 Takes a string as a parameter.
 Removes all non-alphanumeric characters from the string.
 Converts the string to lowercase.
 Returns the cleaned string.
 2. Create another method named isPalindrome that:
 Takes a string as a parameter.
 Uses a loop to compare characters from the start and end of the string, moving towards the center of the string.
 If any pair of characters doesn't match, return false.
 If all pairs of characters match, return true.
 3. In the main method:
 Prompt the user to enter a string.
 Use cleanString to clean the user's input.
 Call isPalindrome with the cleaned string.
 Display the result to the user, informing them whether or not their input was a palindrome.


 Example 1:

 Welcome to the Palindrome Checker!
 Enter a string: Racecar
 The string "Racecar" is a palindrome!


 Example 2:

 Welcome to the Palindrome Checker!
 Enter a string: Java programming
 The string "Java programming" is not a palindrome!

 Example 3:

 Welcome to the Palindrome Checker!
 Enter a string: Madam, in Eden, I'm Adam.
 The string "Madam, in Eden, I'm Adam." is a palindrome!
 */
