package Day13SuperClasses;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzList2 {
    public static void main(String[] args) {
        // Test cases
        System.out.println(fizzBuzzList(new int[]{1, 2, 3})); // [1, 2, "Fizz"]
        System.out.println(fizzBuzzList(new int[]{4, 5, 6})); // [4, "Buzz", "Fizz"]
        System.out.println(fizzBuzzList(new int[]{7, 8, 9, 10, 11, 12, 13, 14, 15})); // [7, 8, "Fizz", "Buzz", 11, "Fizz", 13, 14, "FizzBuzz"]
    }

    public static List<Object> fizzBuzzList(int[] nums) {
        List<Object> result = new ArrayList<>();
        for (int num : nums) {
            if (num % 3 == 0 && num % 5 == 0) {
                result.add("FizzBuzz");
            } else if (num % 3 == 0) {
                result.add("Fizz");
            } else if (num % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(num);
            }
        }
        return result;
    }
}
