package ClassTasks;

public class T55_OverloadedRandomString {

    public static void main(String[] args) {


        // TEST your methods here

        System.out.println( randomString()); //  dshvf (example, the actual chars could be different)

        System.out.println( randomString(10)); //cbsassw
        System.out.println( randomString(5, true)); // RVDHC
        System.out.println( randomString(3, false)); //hsd

    }

    // Create 3 overloaded methods here

    public static String randomString() {
        return randomString(5);
    }

    public static String randomString(int num){

        String collect = "";

        for (int i = 0; i < num; i++){
            collect += (char)(Math.random()*26 + 'a');
        }
        return collect;
    }

    public static String randomString(int num, boolean isUppercase){
        return isUppercase ? randomString(num).toUpperCase() : randomString(num) ;
    }



}

/**
 * Create 3 overloaded versions of randomString() method that generates a random String and returns it
 *
 *   First method should always generate a random String of 5 lowercase charcters and return it
 *
 *   randomString() -> dshvf
 *
 *   Second method should accept the length of the string as parameter and  generate a random String of lowercase charcters of given length
 *
 *  randomString(7) -> cbsassw
 *
 *
 *   Third method should accept the length of the string and boolean parameter called isUppercase  and  generate a random String of uppercase charcters of given length if the boolean value is true, otherwise generates all lowercase
 *
 *  randomString(3, true) -> BCH
 *  randomString(8, false) -> bsavsvsg
 *
 *   Once you create all 3 methods, test them in the main method by passing corresponding arguments.
 */