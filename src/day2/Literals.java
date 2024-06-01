package day2;

public class Literals {

    public static void main(String[] args) {

        System.out.println(345); // example of Integer literal (hardcoded value)
        // any whole number like 23 in Java is considered literal

        System.out.println(343L); // long literal ADD L
        System.out.println(343l); // long literal ADD L

        System.out.println(3.14); // double literal
        System.out.println(3.14D); // double literal
        System.out.println(3d); // double literal
        // any decimal value is by default a double

        System.out.println(3.14F); // float literal has extra F at the end
        System.out.println(3f); // float literal has extra F at the end

        System.out.println('s'); // char literal
        System.out.println("s"); // string literal

        System.out.println(true); //boolean, but if surround by double quotes it's string

        String str = null; // means no value

        long creditCardNo = 4567_1234_7894_1267L; // underscore does not change value, but helps with readability
        // underscore can't come before or at the beginning of a number
        // for double can't also come before/after the dot in decimals

        double radius = 3.67;

        System.out.println(radius * radius); // soft-coding by using variables
        System.out.println(3.67 * 3.67); // hard-coding

        final double INTEREST_RATE = 0.04; // constants written in upper case with underscore separator





    }
}
