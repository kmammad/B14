package Day12;

import java.util.*;
public class ListRemoveWord {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList(new String[]{"java", "python", "java", "scala", "ruby", "clojure", "java"}));
        removeAll(list, "java");
        System.out.println(list); //[python, scala, ruby, clojure]


        List<String> list2 = new ArrayList<>(Arrays.asList(new String[]{"java", "java", "java", "java", "java"}));
        removeAll(list2, "java");
        System.out.println(list2);  // []

    }

    public static void removeAll(List<String> list, String targetWord) {


        for (int i = list.size() - 1; i >= 0; i--) {
            list.remove(targetWord);
            ;
        }


    }
}