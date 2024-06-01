package Day11;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNoMess {

    public static void main(String[] args) {

        int[] arr1 = new int[10];

        int [] arr2 = new int[10];

        Random random = new Random();

        for (int i = 0, j= 0; i < arr1.length; i++, j++) {
//arr[i] = (int)(Math.random()*100+1);

            arr1[i] = ThreadLocalRandom.current().nextInt(100) + 1;
            //arr1[i] = 1+ random.nextInt(100);
            arr2 [j] += arr1[i];
        }

        arr1 [arr1.length-1] = -1;

        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.print("Array 2: " + Arrays.toString(arr2));




    }

}
