package Day12;

import java.util.ArrayList;
import java.util.List;

public class AngleBrackets {
    public static void main(String[] args) throws Exception {

        List<Integer> ages = new ArrayList<>();

        ages.add(Integer.parseInt("5"));
        ages.add(Integer.valueOf("6"));
        ages.add(7);
        ages.add(null);


        for (int age : ages) {
            System.out.println(age);
        }


    }
}
