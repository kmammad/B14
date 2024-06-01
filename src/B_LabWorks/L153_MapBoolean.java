package B_LabWorks;

import java.util.*;

public class L153_MapBoolean {

    public static void main(String[] args) {

        System.out.println(wordMultiple(new String [] {"a", "b", "a", "c", "b"})); //→ {"a": true, "b": true, "c": false}
        System.out.println(wordMultiple(new String [] {"c", "b", "a"})); // → {"a": false, "b": false, "c": false}
        System.out.println(wordMultiple(new String [] {"c", "c", "c", "c"})); // → {"c": true}

    }


    public static Map<String, Boolean> wordMultiple(String [] words){

        Map<String, Integer> map = new HashMap<>();

        for (String word : words){
            map.put(word, map.getOrDefault(word, 0)+1);
        }

        Map<String, Boolean> map1 = new HashMap<>();

        for (Map.Entry<String,Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 2){
                map1.put(entry.getKey(), true);
            } else {
                map1.put(entry.getKey(), false);
            }
        }

        /**
         * Map<String, Boolean> map1 = new HashMap<>();
         *
         *     for (String word : map.keySet()) {
         *         map1.put(word, map.get(word) >= 2);
         *     }
         *
         *     return map1;
         */

        return map1;
    }

}
