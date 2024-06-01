package B_LabWorks;

public class L118_RadixBinaryOctalHex {
    public static void main(String[] args) {
        //TESTS
        System.out.println(binaryToDecimal("1010"));  // 10
        System.out.println(binaryToDecimal("0011"));  // 3
        System.out.println(binaryToDecimal("0100100110000000"));  // 18816
        //System.out.println(binaryToDecimal("234"));  // uncomment to see what happens when an invalid binary number is passed

        System.out.println(octalToDecimal("10"));  // 8
        System.out.println(octalToDecimal("120"));  // 80
        System.out.println(octalToDecimal("0441"));  // 289
        // System.out.println(octalToDecimal("9"));  // uncomment to see what happens when an invalid octal number is passed
        System.out.println(hexToDecimal("A"));  // 10
        System.out.println(hexToDecimal("f6"));  // 246
        System.out.println(hexToDecimal("7777"));  // 30583
        System.out.println(hexToDecimal("5ccb2"));  // 380082
        //System.out.println(hexToDecimal("X099"));  // uncomment to see what happens when an invalid hex number is passed

    }
    /*
      Takes a binary number as String and returns its decimal representation as int.
      Google parseInt(String s, int radix) method of Integer class
    */
    public static int binaryToDecimal(String num){

        return Integer.parseInt(num, 2);
    }
    /*
      Takes an octal number as String and returns its decimal representation as int.
      Google parseInt(String s, int radix) method of Integer class
    */
    public static int octalToDecimal(String num){
        return Integer.parseInt(num, 8);
    }
    /*
      Takes a hexadecimal number as String and returns its decimal representation as int.
      Google parseInt(String s, int radix) method of Integer class
    */
    public static int hexToDecimal(String num){
        return Integer.parseInt(num, 16);
    }

}
