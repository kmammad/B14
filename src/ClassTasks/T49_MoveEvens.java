package ClassTasks;

import java.util.Arrays;

public class T49_MoveEvens {

    public static void main(String[] args) {


        //TEST1
        int[] arr1 = {1, 0, 1, 0, 0, 1, 1};
        moveEvensToFront(arr1);
        System.out.println(Arrays.toString(arr1)); // [0, 0, 0, 1, 1, 1, 1]

// TEST2
        int[] arr2 = {3, 3, 2};
        moveEvensToFront(arr2);
        System.out.println(Arrays.toString(arr2)); // [2,3,3]

        int [] arr3 = {2, 2, 2};
        moveEvensToFront(arr3); // → [2, 2, 2]
        System.out.println(Arrays.toString(arr3));

        int [] arr4 = {3, 6, 2, 2, 2};
        moveEvensToFront(arr4); // → [2, 2, 2, 6, 3 ]
        System.out.println(Arrays.toString(arr4));
    }




    public static void moveEvensToFront(int[] arr){

        OUTER: for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr [j] % 2 == 0) {
                    int temp = arr [j];
                    arr [j] = arr [i];
                    arr [i] = temp;
                    continue OUTER;
                }
            }
        }


    }
}

/**
 * Modify the array so that it contains the exact same numbers as the given array, but rearranged so that all the even numbers come before all the odd numbers. Other than that, the numbers can be in any order. You may modify and return the given array, or make a new array.
 *
 *
 * moveEvensToFront([1, 0, 1, 0, 0, 1, 1]) → [0, 0, 0, 1, 1, 1, 1]
 * moveEvensToFront([3, 3, 2]) → [2, 3, 3]
 * moveEvensToFront([2, 2, 2]) → [2, 2, 2]
 * moveEvensToFront([3, 6, 2, 2, 2]) → [2, 2, 2, 6, 3 ]
 */
