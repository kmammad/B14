package Assignmenents;

import java.util.Arrays;

public class A17_MoveZeroes {

    public static void main(String[] args) {
        //Check your output using the tests:

        //TEST 1
        int [] arr1 = {0,1,0,3,12};
        moveZeroes(arr1);
        System.out.println(Arrays.toString(arr1)); //  [1, 3, 12, 0, 0]
        //TEST 2
        int [] arr2 = {0,0,0,0,0,0,1};
        moveZeroes(arr2);
        System.out.println(Arrays.toString(arr2)); //  [1, 0, 0, 0, 0, 0, 0]
        //TEST 3
        int [] arr3 = {12,2,0,0,2,0,0,78,0,12,0};
        moveZeroes(arr3);
        System.out.println(Arrays.toString(arr3)); //  [12, 2, 2, 78, 12, 0, 0, 0, 0, 0, 0]
        //TEST 4
        int [] arr4 = {0};
        moveZeroes(arr4);
        System.out.println(Arrays.toString(arr4)); //  [0]
    }

    public static void moveZeroes(int [] nums){
        // implement here
        int zeroInd = 0;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] != 0){
                nums[zeroInd] = nums[i];
                zeroInd++;
            }
        }

        for (int i = zeroInd; i < nums.length; i++) {
            nums[i] = 0;
        }

    }

}
/**
 Given an int array called nums, move all 0's to the end of it while maintaining the order of the other elements.

 Note that you must do this in-place without making a copy of the array, that is, you must modify the given array without creating a new one.

 Examples:
 {0, 1, 0, 3, 12} -> {1, 3, 12, 0, 0}
 {22, 0, 10, 0, 9, 0, 12, 0} -> {22, 10, 9, 12, 0, 0, 0, 0}
 {0,0,0,0,0,0,1} -> {1,0,0,0,0,0,0}
 {22,0,0} -> {22,0,0}
 {0} -> {0}

 */
