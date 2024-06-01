package ClassTasks;

import java.util.Random;

public class TAPR5_RandomPasswordString {

    public static void main(String[] args) {

        System.out.println(generateProductId());
    }


    public static String generateProductId(){
        String alpha = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#$%^&*";
        StringBuilder str = new StringBuilder();
        for (int index = 0; index < 10; index++) {
            int randIndex = new Random().nextInt(alpha.length());
            str.append(alpha.charAt(randIndex));
        }


        return str.toString();

    }


}

/**
 * public static String generateProductId(){
 *     String alpha = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#$%^&*";
 *     String str = "";
 *     for (int index = 0; index < 10; index++) {
 *       int randIndex = new Random().nextInt(alpha.length());
 *       str += alpha.charAt(randIndex);
 *     }
 *
 *
 *     return str;
 *
 *   }
 */
