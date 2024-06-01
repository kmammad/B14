package ClassTasks;

public class T46_PigLatin {

    public static void main(String[] args) {
        //TESTS
        System.out.println(pigLatin("I slept most of the night")); //Iay leptsay ostmay foay hetay ightnay
        System.out.println(pigLatin("Java is fun")); //avaJay siay unfay
        System.out.println(pigLatin("How many languages do you speak")); //owHay anymay anguageslay oday ouyay peaksay

    }

    public static String  pigLatin(String sentence){

        String [] arr = sentence.toLowerCase().split(" ");

        for (int i = 0; i < arr.length; i++){

            arr[i] = arr [i].substring(1) + arr[i].substring(0,1) + "ay";
        }
        //   System.out.println(Arrays.toString(arr));


        return String.join(" ", arr).substring(0, 1).toUpperCase() + String.join(" ", arr).substring(1);
    }

}

/**
 * Create a method that takes a String and  converts each word to Pig latin. Pig Latin is a constructed language game in which words in English are altered according to a simple set of rules. In this exercise, convert the word by removing the first letter, placing the that letter at the end of the word, and then appending "ay" to the word. Here is an example:
 *
 * English: I slept most of the night
 * Pig Latin: Iay leptsay ostmay foay hetay ightnay
 *
 *
 *   Examples:
 *
 *      Java is fun - > avaJay siay unfay
 *      How many languages do you speak -> owHay anymay anguageslay oday ouyay peaksay
 *
 *
 *  // Pseudocode
 *
 *  // Split the string into individual words
 *  // Iterate through array of Strings and access each word, modify the word based on the rule and assign it back to each element (words[i])
 *  // Join the words back into String using join method
 *
 *
 */
