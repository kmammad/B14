package ClassTasks;

public class T19_ExtraEndString {
    public static void main(String[] args) {

        System.out.println(extraEnd("Hello"));  // lololo
        System.out.println(extraEnd("Hi"));  // HiHiHi
        System.out.println(extraEnd("School"));  // ololol
        System.out.println(extraEnd("Java"));  // vavava
        System.out.println(extraEnd("ab")); //"ababab"
        System.out.println(extraEnd("World")); // → "ldldld"
        System.out.println(extraEnd("saitama")); // → "mamama"
        System.out.println(extraEnd("doge")); // → "gegege"
        System.out.println(extraEnd("shiba")); // → "bababa"


    }

    public static String extraEnd(String str){

        String last2 = str.substring(str.length() -2);

        String str2 = last2 + last2 + last2;

        // for (int i = 0; i < str.length(); i++){
        //   if (str.startsWith(last2, i))
        //     str2 = last2 + last2 + last2;

        //}

        return str2;
    }

}
/**
 *
 Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.

 extraEnd("Hello") → "lololo"
 extraEnd("ab") → "ababab"
 extraEnd("Hi") → "HiHiHi"
 extraEnd("World") → "ldldld"
 extraEnd("saitama") → "mamama"
 extraEnd("doge") → "gegege"
 extraEnd("shiba") → "bababa"


 *
 */
