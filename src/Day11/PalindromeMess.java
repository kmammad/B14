package Day11;

import java.util.*;


public class PalindromeMess {
    public static void main(String[] args) {

        System.out.println("Welcome to the Palindrome Checker!");

        System.out.print("Enter your word to check: ");

        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        System.out.println(cleanString(str));
    }

    public static String cleanString(String str){

     String strL = str.toLowerCase();

     String justLet = "";

        for (int i = 0; i < strL.length(); i++){
            char each = strL.charAt(i);
            if (Character.isLetter(each)){
                justLet += each;
            }
        }

//        Character.isLowerCase();
  //      Character.isUpperCase();


        String str2 = "";

boolean isPalindrome = true;

 for (int j = 0; j < justLet.length()/2; j++){
      if (justLet.charAt(j) != justLet.charAt (justLet.length() -1 - j)) {
         isPalindrome = false;
         break;

     }
 }

 if (isPalindrome) {
     str2 = "The String " + "\"" + str + "\" " + "is a palindrome!";
 } else {
     str2 = "The String " + "\"" + str + "\" " + "is not a palindrome!";
            }

return str2;

    }
}
