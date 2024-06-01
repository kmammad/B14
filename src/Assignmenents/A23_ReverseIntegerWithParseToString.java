package Assignmenents;

public class A23_ReverseIntegerWithParseToString {

    /**
     * Create  a method that takes an int called x and returns its reversed version as int.
     *  - Your method should work with both positive and negative values.
     *  - Additionally, if reversing a number creates a value that does not fit into an int and causes an integer overflow,   your method should return 0 instead.
     *    Integer overflow happens when you try to fit into integer variable a value that is more than the Integer.MAX_VALUE (2147483647) or the opposite. Ex: 2147483647 + 1  ->  -2147483648
     *  - You can use any approach to reverse (modulo and division, String, StringBuilder, etc)
     *
     */

    public static void main(String[] args) {

        //TESTS

        System.out.println(reverse(123456)); // 654321
        System.out.println(reverse(-123456)); // -654321
        System.out.println(reverse(1147483647)); // 0  -> because 7463847411 is out of range for int
        System.out.println(reverse(2110000002)); // 2000000112
        System.out.println(reverse(-1366899991)); //-1999986631
        System.out.println(reverse(-2147321113)); // 0  -> because -3111237412 is out of range for int

    }

    public static int reverse(int x){  //do not change the method parameter and return type

        StringBuilder sb = new StringBuilder(Integer.toString(Math.abs(x))).reverse();

        long reverse = Long.parseLong(sb.toString());

        if (reverse > Integer.MIN_VALUE && reverse < Integer.MAX_VALUE) {

            if (x > 0)
            {
                return (int) reverse;
            }
            else if (x < 0)
            {
                return (int) reverse * -1;
            }

        }

        return 0;

    }
}
