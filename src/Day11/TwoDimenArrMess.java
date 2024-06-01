package Day11;

import java.util.*;

public class TwoDimenArrMess {

    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3},
                {4, 5, 6},
                {1, 0, 1},
        };


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

            System.out.println(Arrays.toString(arr[minRowInd]));

            //int [][] arr2 = arr.clone();

           // for(int each)


    }
}