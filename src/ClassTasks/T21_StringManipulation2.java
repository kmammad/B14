package ClassTasks;

public class T21_StringManipulation2 {
    public static void main(String[] args) {

        //TESTS
        System.out.println(middleTwo("string"));
        System.out.println(middleTwo("code"));
        System.out.println(middleTwo("Practice"));
        System.out.println(middleTwo("hi"));
        System.out.println(middleTwo("ethereum") );
        System.out.println(middleTwo("window") );
        System.out.println(middleTwo("internet") );

    }

    //Write your method here

    public static String middleTwo(String str){

        int middlePoint = str.length() / 2;

        String middle2 = str.substring(middlePoint -1 , middlePoint + 1);

        return middle2;
    }

}
/**
 *
 Create  method called middleTwo.
 Given a string of even length, it returns a string made of the middle two chars, so the string "string" yields "ri".
 The string length will be at least 2.


 middleTwo("string") → "ri"
 middleTwo("code") → "od"
 middleTwo("Practice") → "ct"
 middleTwo("hi") → "hi"
 middleTwo("ethereum") → "er"
 middleTwo("window") → "nd"
 middleTwo("internet") → "er"
 *
 */