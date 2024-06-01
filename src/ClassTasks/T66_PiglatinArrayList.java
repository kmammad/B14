package ClassTasks;

import java.util.*;

public class T66_PiglatinArrayList {
    public static void main(String[] args) {

        //TEST CASE
        ArrayList<String> list = new ArrayList<>();
        list.add("java");
        list.add("hello");
        list.add("hi");
        list.add("phone");

        changePigLatin(list);

        System.out.println(list); //["avajay", "ellohay", "ihay", "honepay"]

    }

    public static void changePigLatin(ArrayList<String> list){

        // implement here

        for (int i = 0; i < list.size(); i++){
            String word = list.get(i);
            char first = word.charAt(0);
            String rest = word.substring(1);
            list.set(i, rest + first + "ay");
        }

        // return list;
    }





}
