package B_LabWorks;



public class L115_StringBuilderRemoveCharsMethod {

    public static void main(String[] args) {

        //TEST

        System.out.println( removeNonAlphaNumeric("https://www.duotech.io/") ); //  -> httpswwwduotechio
        System.out.println( removeNonAlphaNumeric("`HGN)B#Rmck~Xv3") ); // -> HGNBRmckXv3
        System.out.println( removeNonAlphaNumeric("(703) 569-1510") ); //-> 7035691510
    }

/**
 public static String removeNonAlphaNumeric(String str){
 //implement

 StringBuilder sb = new StringBuilder();

 String str1 = str.replaceAll("[^a-zA-Z0-9^]", "");

 return str1;
 }
 }

 */

    /**
     public static String removeNonAlphaNumeric(String str){
     //implement

     StringBuilder sb = new StringBuilder();

     for (int i = 0; i < str.length(); i++){

     if( (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') || (str.charAt(i) >= '0' && str.charAt(i) <= '9') )

     {
     sb.append(str.charAt(i));
     }

     }

     return sb.toString();
     }
     */
    public static String removeNonAlphaNumeric(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

}

/**
 * Create a method called removeNonAlphaNumeric() that takes a String and removes all characters that are not letters or numbers. Use StringBuilder methods to achieve the objective.
 *
 *  Examples:
 *   https://www.duotech.io/  -> httpswwwduotechio
 *   `HGN)B#Rmck~Xv3  -> HGNBRmckXv3
 *   (703) 569-1510 -> 7035691510
 *
 *
 */
