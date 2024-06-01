package day15;

import java.util.*;

public class ListOfList {

    public static void main(String[] args) {

       // List < List <String> > list = new ArrayList<>();

        List<String> firstSt = List.of("1", "Bob", "Dole");
        List<String> secondSt = List.of("2", "Alice", "Smith");
        List<String> thirdSt = List.of("3", "Jane", "Eyre");

        List < List <String> > list = List.of(firstSt, secondSt,thirdSt);

        System.out.println(list.get(2));




    }
}
