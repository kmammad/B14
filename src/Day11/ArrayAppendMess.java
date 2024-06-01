package Day11;
import javax.sound.midi.Soundbank;
import java.util.*;

public class ArrayAppendMess {

    public static void main(String[] args) {

        int [] arr1 = {1,2,3,4,5,6};
        int [] arr2 = {9,2,1};

        int [] arr3 = new int[arr1.length + arr2.length];

       // Arrays.copyOf(arr3, 0, arr1.length, 0, arr2.length);

        for(int i: arr3) {
            System.out.print(i + " ");
        }


        //System.out.println(Arrays.toString(arr3));
    }
}
