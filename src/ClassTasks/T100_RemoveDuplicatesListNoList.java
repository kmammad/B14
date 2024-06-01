package ClassTasks;

import java.util.*;
public class T100_RemoveDuplicatesListNoList {

    public static void main(String[] args) {

        //TEST

        System.out.println(Arrays.toString(removeDuplicates(new int[] {1,2,3,4}))); // [1,2,3,4]
        System.out.println(Arrays.toString(removeDuplicates(new int[] {1,1,1,1}))); // [1]
        System.out.println(Arrays.toString(removeDuplicates(new int[] {1,2,2,1}))); // [1,2]
        System.out.println(Arrays.toString(removeDuplicates(new int[] {1,2,3,1,2,3}))); // [1,2,3]

        System.out.println(Arrays.toString(removeDuplicates1(new int[] {1,2,3,1,2,3}))); // [1,2,3]
        // [1,1,2,2,3,3]
        System.out.println(Arrays.toString(removeDuplicates1(new int[] {1,1,1,1}))); // [1]

    }

    public static int[] removeDuplicates1 (int[] numbersWithDuplicates) {
        //implementation goes here

        // Sort the original array
        Arrays.sort(numbersWithDuplicates);

        int length = numbersWithDuplicates.length;

        // Create a temp array that is equal to the length of the original
        int[] temp = new int[length];
        int j = 0;

        for (int i = 0; i < length-1; i++){
            if (numbersWithDuplicates[i] != numbersWithDuplicates[i+1]){
                temp[j] = numbersWithDuplicates[i];
                j++;
            }
        }
//  For the last element
        temp[j++] = numbersWithDuplicates[length-1];

        int[] clean = new int[j]; // without zeros

        for(int i = 0; i < j; i++){
            clean[i] = temp[i];
        }

        return clean;
    }

    public static int[] removeDuplicates (int[] numbersWithDuplicates) {
        //implementation goes here

        Set <Integer> set = new LinkedHashSet<>();

        for (int num : numbersWithDuplicates) {
            set.add(num);

        }

        int[] clean = new int[set.size()];

        int index = 0;

        for (int num : set) {
            clean[index] = num;
            index++;
        }

        return clean;

    }

}
