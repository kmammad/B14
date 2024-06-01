package B_LabWorks;

public class L116_StringBuild_Palindrome {

    /**
     * Create a method that checks if a String is a palindrome. Punctuation, capitalization, and spaces are ignored in this case. Use StringBuilder class methods to implement the method.
     *
     *   Examples:
     *    Able was I ere I saw Elba -> true
     *    A man, a plan, a canal – Panama -> true
     *    Madam, I'm Adam -> true
     *    Mr. Owl ate my metal worm -> true
     *    Do geese see God? -> true
     *    Was it a car or a cat I saw? -> true
     *    Go hang a salami, I'm a lasagna hog -> true
     *    Show me the code -> false
     */

    public static void main(String[] args) {
        //TEST

        String str = "Able was I ere I saw Elba";

        System.out.println("Is \"" + str + "\" a palindrome? " + isPalindrome(str) );

        System.out.println(isPalindrome("A man, a plan, a canal – Panama ") );

        System.out.println(isPalindrome("Madam, I'm Adam") );
        System.out.println(isPalindrome("Mr. Owl ate my metal worm") );
        System.out.println(isPalindrome("Do geese see God?") );
        System.out.println(isPalindrome("Was it a car or a cat I saw?") );
        System.out.println(isPalindrome("Go hang a salami, I'm a lasagna hog") );
        System.out.println(isPalindrome("Show me the code") );

    }


    public static boolean isPalindrome(String str){

        // implement

        StringBuilder str1 = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isLetter(ch)) {
                str1.append(Character.toLowerCase(ch));
            }
        }

        StringBuilder sb = new StringBuilder(str1).reverse();


        return str1.toString().equals(sb.toString());
    }

}
