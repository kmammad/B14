package ClassTasks;

public class T36_FindFirstDuplicateChar {

    public static void main(String[] args) {
        //
        duplicate("avcdevfc");

        System.out.println(duplicate2("aacdevfc"));

        duplicate("acdedfce");

    }


    public static void duplicate(String str){

        boolean hasDuplicate = false; // boolean flag


        OUTER: for (int i = 0; i < str.length() - 1; i++){


            for (int j = i+1; j < str.length(); j++){
                if (str.charAt(i) == str.charAt(j)){
                    hasDuplicate = true;
                    System.out.println(str.charAt(i));
                    break OUTER;
                }

            }

        }
        if (!hasDuplicate){
            System.out.println("no duplicates found");
        }
    }



    public static char duplicate2(String str){

        for (int i = 0; i < str.length() - 1; i++){

            for (int j = i+1; j < str.length(); j++){
                if (str.charAt(i) == str.charAt(j)){
                    return str.charAt(i);
                }
            }
        }
        return '\u0001';
    }
}
/**
 *Create a method that prints the first duplicate char of the String. If no duplicate char is found, prints an empty char ('\u0001'). Use break keyword.
 *
 *
 * duplicate("avcdevfc") -> v
 * duplicate("aacdevfc") -> a
 * duplicate("acdedfce") -> c
 */
