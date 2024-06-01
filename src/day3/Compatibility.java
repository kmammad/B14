package day3;

public class Compatibility {

    public static void main(String[] args) {

        byte b =  45;

        long l = b;

        double d = b; // automatic or implicit upcasting/conversion

        System.out.println(d);

        float f = 34L; // explicit downcasting
        System.out.println(f);


        int i = (int)35L;
        System.out.println(i);

        double height = 23.99; // downcasting results in loss of precision

        int h = (int)height;
        System.out.println(h);


        int num1 = 131;
        byte b2 = (byte)num1;
        System.out.println(b2); // result is -128, if is not within its range, it wil put it to the start point of the range - negative number

// integer overflow
        byte byteNum = 127;
        System.out.println(++byteNum); // -128

// integer underflow
        byte byteNum2 = -128;
        System.out.println(--byteNum2); // 127


        byte a = 100;
        byte b1 = 27;
        // byte result = a + b; will result in compile error due to compiler promotes each byte to int for the operation

        byte result = (byte)(a + b1); // or int result = a + b;

        System.out.println(result);


         }
}
