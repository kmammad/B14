package Assignmenents;

import java.util.*;

public class A27_MapOccurenceIntegerFromStringtoString {

    public static void main(String[] args) {

        IntegerOccurrence ("1 5 9 2 1 5 8 1");

    }

    //create your method here

    public static void  IntegerOccurrence (String str){

        String [] arr = str.split(" ");

        Map <Integer, Integer> map = new HashMap<>();

        for (String s : arr){
            int num = Integer.parseInt(s);
            map.put(num, map.getOrDefault(num, 0) +1);
        }

        StringBuilder sb = new StringBuilder();

        for (Map.Entry<Integer, Integer> entry : map.entrySet() ){
            sb.append(entry.getKey() ).append("(").append(entry.getValue()).append(")").append(" ");
        }

        System.out.println(sb.toString());

    }

}
