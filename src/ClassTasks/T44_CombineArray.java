package ClassTasks;

import java.util.Arrays;

public class T44_CombineArray {
    public static void main(String[] args){
        // Tests
        String [] arr = combineNames(new String[] {"bob","joe","rob"} , new String[] {"jones","smith","paul"});
        System.out.println(Arrays.toString(arr)); // -> [bob jones, joe smith, rob paul]

        String [] arr1 = combineNames(new String[] {"Barack","Kamala"} , new String[] {"Obama","Harris"});
        System.out.println(Arrays.toString(arr1)); // -> [Barack Obama, Kamala Harris]

        String [] arr2 = combineNames(new String[] {"Hey","What's up"} , new String[] {"Yo","Man"});
        System.out.println(Arrays.toString(arr2)); // -> [Hey Yo, What's up Man]


    }



    public static String[] combineNames(String[] first, String[] second){

        // implement here

        // String [] combined = new String [first.length];

        for (int i = 0; i < first.length; i++) {
            first[i] = first[i] + " " + second[i];
        }

        return first;

    }
}

/**
 *
 * Create a method called combineNames that accepts 2 String arrays and returns a new String array that is composed of the combination of each element of each given array. You can assume two array lengths will be equal.
 *
 * Examples:
 *
 * {"bob","joe","rob"} , {"jones","smith","paul} -> ["bob jones", "joe smith", "rob paul"]
 * {"Barack","Kamala"} ,  {"Obama","Harris"} -> ["Barack Obama", "Kamala Harris"]
 * {"Hey","What's up"} , {"Yo","Man"} -> ["Hey Yo", "What's up Man"]
 */