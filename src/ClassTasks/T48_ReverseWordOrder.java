package ClassTasks;

public class T48_ReverseWordOrder {
    public static void main(String[] args) {
        // test your method here

        System.out.println(reverseWordOrder("Hi How Are You")); //You Are How Hi
        System.out.println(reverseWordOrder("talk is cheap. show me the code")); //code the me show cheap. is talk


    }


    public static String reverseWordOrder(String str){

        // implement here

        String [] arr = str.split(" ");


        for (int i = 0, j = arr.length - 1; i < j; i++, j--){

            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }
        return String.join(" ", arr);
    }

}

/**
 * Given a String, return its version where order of words are reversed.
 *
 *  Examples:
 *    "Hello World" -> "World Hello"
 *    "Java is fun"  -> "fun is Java"
 *    "Hi How Are You" -> "You Are How Hi"
 *    "talk is cheap. show me the code" -> "code the me show cheap. is talk"
 */
