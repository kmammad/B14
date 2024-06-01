package Day12;

import java.util.*;

public class ListMess {

    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("hey", "yo");
        List<String> list2 = Arrays.asList("what", "up");

        List<String> list3 = new ArrayList<>();

        for (int i = 0; i < list1.size(); i++) {
            list3.add(list1.get(i));
        }

        for (int i = 0; i < list2.size(); i++) {
            list3.add(list2.get(i));
        }


        System.out.println(list3);
    }
}
