package ClassTasks;

import java.util.*;
public class T73_WordCountMapStringSentence {

    public static void main(String[] args) {

        System.out.println(wordCount("I would like to go to the park and I would like to play soccer"));

        System.out.println(wordCount("I you him you them you I her her her I"));
        
    }
    
    public static Map <String,Integer> wordCount (String sentence) {

        
       String [] arr = sentence.toLowerCase().split("[ ,.;]");

        Map <String, Integer> map = new LinkedHashMap<>();

        for (String s : arr) {

            if ( !s.isEmpty() ) {
                map.put(s, map.getOrDefault(s, 0) + 1);
            }
        }
        
        
        return map;
    }
}