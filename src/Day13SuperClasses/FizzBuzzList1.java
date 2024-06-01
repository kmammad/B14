package Day13SuperClasses;

import java.util.*;

public class FizzBuzzList1 {

    public static void main(String[] args) {

        Integer [] arr = {1,2,3};

        List<String> list = new ArrayList<>();

        for (Integer num : arr) {
            list.add(num.toString());
        }

        int length = arr.length;

        for (int i = 0; i < length; i++) {

            if (arr[i] % 3 == 0 && arr [i] % 5 == 0) {
                list.set(i, "FizzBuzz");
            }

            else if (arr [i] % 3 == 0){
                list.set(i, "Fizz");
            }

            else if (arr [i] % 5 == 0) {
                list.set(i, "Buzz");
            }
        }

        System.out.println(list);

    }
}
