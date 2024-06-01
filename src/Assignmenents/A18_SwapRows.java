package Assignmenents;

import java.util.Arrays;

public class A18_SwapRows {

    public static void main(String[] args) {

        int[][] arr1 = { {1,2,3},
                {4,5,6},
                {1,0,1}, // row with min sum
        };

        System.out.println(Arrays.deepToString(swapFirstRowWithMinRow(arr1)));

        int [][] arr2 = { {6, 7, 9, 4, 8},
                {3, 2, 7, 4, 1},
                {9, 4, 5, 8, 9},
        };

        System.out.println(Arrays.deepToString(swapFirstRowWithMinRow(arr2)));
    }

    public static int[][] swapFirstRowWithMinRow(int[][] arr){

        int min = Integer.MAX_VALUE;
        int minRowInd = 0;

        for (int i = 0; i < arr.length; i++) {

            int sum = 0;

            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }

            if (sum < min) {
                min = sum;
                minRowInd = i;
            }
        }

        int[] temp = arr[0];
        arr[0] = arr[minRowInd];
        arr[minRowInd] = temp;

        return arr;

    }

}
/**
 Create a method that takes a 2D array of ints, and swaps the row with the minimum sum with the first row and returns that array.

 Example:

 Given:

 {1,2,3}
 {4,5,6}
 {1,0,1} // row with min sum


 Returns:
 {1,0,1} // swapped with the first row values
 {4,5,6}
 {1,2,3}



 Example 2:

 Given:

 {6, 7, 9, 4, 8}
 {3, 2, 7, 4, 1}
 {9, 4, 5, 8, 9}


 Returns:

 {3, 2, 7, 4, 1}
 {6, 7, 9, 4, 8}
 {9, 4, 5, 8, 9}



 */
