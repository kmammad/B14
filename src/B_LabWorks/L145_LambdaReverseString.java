package B_LabWorks;

import java.util.*;

public class L145_LambdaReverseString {
    public static void main(String[] args) {

       ArrayList<String> list = new ArrayList<> (Arrays.asList("hello", "world", "java", "stream", "lambda") );

       list.removeIf(n -> n.length() <= 5);

       list.replaceAll(n -> new StringBuilder(n).reverse().toString());

        System.out.println(list);

        double x = Math.pow(3,3);

        System.out.println(x);

    }
}
