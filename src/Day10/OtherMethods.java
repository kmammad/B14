package Day10;

public class OtherMethods {

    public static void main(String[] args) {


        String str = "HELLO";

        String repeat = str.repeat(256);

        System.out.println(repeat);

        // Conversion of anything to string

        String num = "" +56;
        String bool = "" + true;
        String ch = "" + 'c';

        String s = String.valueOf(59);
        String g = String.valueOf('f');
        String f = String.valueOf(false);

        System.out.println(s);
        System.out.println(g);
        System.out.println(f);

        // Check if string is empty

        String text = " ";

        if(!text.isEmpty()) {
            System.out.println(text.substring(0, 1));
        }



    }
}
