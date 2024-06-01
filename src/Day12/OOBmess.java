package Day12;

import static java.util.Arrays.sort;

public class OOBmess {

    public static void main(String[] args) {
        final int max = 10;

        System.out.println(max);

        String str = "Madam, I'm Adam";

        System.out.println("Original String " + str);

        StringBuilder sb = new StringBuilder(str);

        sb.reverse();

        System.out.println(sb);;

        System.out.println("Original String " + str);
    }


}

