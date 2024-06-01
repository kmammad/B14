package day1;

public class Primitives {

    public static void main(String[] args) {

        int num = 5645;

        System.out.println(num);

        String name = "Bob"; // is not primitive type, it is object type, can store string of characters
        System.out.println(name.toUpperCase());

        byte b = 127; // 1 byte of memory, -128 to 127
        short sh = 32767; // 2 bytes of memory, -32,768 to 32,767
        int i = 2147483647; // 4 bytes, 32 bits, -2,147,483,648 to 2,147,483,647
        long accountNumber = 6236345667890123L; // 8 bytes use L at the end e.g. to store credcard, 19 digit numbers

        float f = 4.5F; // 4 bytes, requires F more readable, can store 7 digits after the dot
        double d = 4.6; // 8 bytes - most commonly, more precision, can store all digits after the dot, adding D is optional

        char ch = '$'; // 2 bytes, single character, single quotes for characters, double quotes for text, Unicode table from 0 to 65535

        boolean isEven = false; // 1 bit, true or falce, you can't store 0 or 1, used to store conditions, if statements

       // if(isEven) {
       //     System.out.println("Even");
       // }else {
       //     System.out.println("Odd");
       //
      //   }

        // local variables declared withing the method need to be initialized before using

    }
}
