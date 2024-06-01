package ClassTasks;

public class T12_OddEven {
    public static void main(String[] args) {


        //test your method

        System.out.println(isEven(5));
        System.out.println(isEven(10));
        System.out.println(isEven(34));
        System.out.println(isEven(231));
    }


    //create your method here

    public static boolean isEven(int x){

        boolean even = false;

        if (x % 2 == 0) {
            return true;
        }

        return false;

    }
}
/**
 *Write a method that takes an integer and returns true if the number is even otherwise returns false.
 *    Use  % operator to check for evenness or oddness
 *
 *    isEven(5); ->  //  false
 *    isEven(10); -> //  true
 *    isEven(34); -> //  true
 *    isEven(231); -> //  false
 *
 */
