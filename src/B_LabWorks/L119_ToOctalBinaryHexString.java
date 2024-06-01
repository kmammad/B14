package B_LabWorks;

public class L119_ToOctalBinaryHexString {

    public static void main(String[] args) {
        //TESTS
        System.out.println(decimalToBinary(245)); //11110101
        System.out.println(decimalToBinary(5899)); //1011100001011
        System.out.println(decimalToBinary(11)); //1011

        System.out.println(decimalToOctal(245)); //365
        System.out.println(decimalToOctal(5899)); //13413
        System.out.println(decimalToOctal(11)); //13

        System.out.println(decimalToHex(245)); //f5
        System.out.println(decimalToHex(5899)); //170b
        System.out.println(decimalToHex(11)); //b

    }

    /*
       Takes a decimal number as int and returns its binary version as String
       Google Integer class's built-in method that does that
    */
    public static String decimalToBinary(int num){

        return Integer.toBinaryString(num);
    }
    /*
       Takes a decimal number as int and returns its octal version as String
       Google Integer class's built-in method that does that
    */
    public static String decimalToOctal(int num){
        return Integer.toOctalString(num);
    }

    /*
      Takes a decimal number as int and returns its hexadecimal version as String
      Google Integer class's built-in method that does that
   */
    public static String decimalToHex(int num){
        return Integer.toHexString(num);
    }



}
