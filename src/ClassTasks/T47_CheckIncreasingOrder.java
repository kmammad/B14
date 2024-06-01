package ClassTasks;

public class T47_CheckIncreasingOrder {
    public static void main(String[] args) {

        // TESTS

        System.out.println(numsIncreasing(new int[]{1, 3, 4}));  //→ true
        System.out.println(numsIncreasing(new int[]{1, 3, 2})); // → false
        System.out.println(numsIncreasing(new int[]{1, 1, 4})); // → true
        System.out.println(numsIncreasing(new int[]{1, 1, 0, 2, 3, 4})); // → false



    }


    public static boolean numsIncreasing(int[] arr) {

        // boolean sorted = true;

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1]){
                // sorted = false;
                // break;
                return false;
            }
        }


        // return sorted;
        return true;
    }

}
/**
 * Given an array of integers, return true if each number is equal or greater than the one before. The array will be length 2 or more.
 *
 *
 * numsIncreasing([1, 3, 4]) → true
 * numsIncreasing([1, 3, 2]) → false
 * numsIncreasing([1, 1, 4]) → true
 * numsIncreasing([1, 1, 2, 4, 4, 7]) → true
 * numsIncreasing([1, 1, 2, 4, 3, 7]) → false
 * numsIncreasing([-5, 4, 11]) → true
 */