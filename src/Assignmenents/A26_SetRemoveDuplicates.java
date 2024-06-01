package Assignmenents;

import java.util.LinkedHashSet;
import java.util.Set;

public class A26_SetRemoveDuplicates {
    public static void main(String[] args) {

        System.out.println(removeDuplicates("aaafffbccccdde")); //afbcde

    }

public static String removeDuplicates(String str){

        Set<Character> set = new LinkedHashSet<>();

    for (char ch : str.toCharArray() ) {
        set.add(ch);
    }

    StringBuilder sb = new StringBuilder();

    for (Character c : set ) {
        sb.append(c);
    }
        return sb.toString();
}

}
