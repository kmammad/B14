package Day12;

import java.sql.SQLOutput;
import java.util.Arrays;

public class ArrayMess {

    public static void main(String[] args) {
        
        int[] nums = new int [] {1,2,4,3,100};
        
Arrays.sort(nums);

int sum = 0;
int count = 0;

        for (int i = 1; i < nums.length-1 ; i++) {

            sum += nums[i];
            count++;

        }

        System.out.println(sum/count);
    }
}
