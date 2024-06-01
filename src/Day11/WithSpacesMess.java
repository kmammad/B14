package Day11;

public class WithSpacesMess {

    public static void main(String[] args) {

        String str = "Hello World!";

        String strWithSpaces = "";

        for (int i = str.length()-1; i >= 0; i--) {

            strWithSpaces += str.charAt(i) + " ";
        }

        System.out.println(strWithSpaces);
    }
}