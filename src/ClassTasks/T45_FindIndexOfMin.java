package ClassTasks;

public class T45_FindIndexOfMin {

    public static void main(String[] args) {

        //Find the index of minimum value in an array

        int[] arr = {34,22,45,12,56,22,77,12};  // 3

        // The minimum value in this array is 12 which is located at index 3

        //Write your code here

        int min = Integer.MAX_VALUE;

        int minIndex = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
                minIndex = i;
            }
        }

        System.out.println(min + " at index " + minIndex);

    }
}
